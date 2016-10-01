#!/bin/bash

ROOT_DIR=src/basicl/
MAIN_DIR=${ROOT_DIR}/main/
TESTS_FILES=test/resources/*

if [ ! -d build ]; then
	echo "[INFO] Creating build dir structure"
	mkdir build/
	mkdir build/test_output
	mkdir build/bin
fi

echo ---------compiling jjt Files---------
jjtree -OUTPUT_DIRECTORY=${MAIN_DIR} ${MAIN_DIR}/BasicL.jjt

echo ---------compiling jj Files---------
javacc -OUTPUT_DIRECTORY=${MAIN_DIR} ${MAIN_DIR}/BasicL.jj

echo ---------compiling java Files---------
javac -d build/bin -classpath build/bin/ $(find ${ROOTDIR} | grep .java)

echo ----------running tests---------
TEST_OUT="build/test_output/$(date +%d%m%y%H%M%S).txt"
echo "[INFO] Logging test output to ${TEST_OUT}"
for file in $TESTS_FILES ; do
	echo "[INFO] Running test for file ${file}"
	echo -e "\n${file}\n" >> ${TEST_OUT}
	java -classpath build/bin/ basicl.main.BasicL ${file} >> ${TEST_OUT}
done
