#!/usr/bin/python3
import shutil
import subprocess
import sys


def main():
    gen_tests = subprocess.run(["java", "-classpath", "target/classes/:../randoop-4.3.2/randoop-all-4.3.2.jar",
                                "randoop.main.Main", "gentests", "--classlist=classestesting.txt",
                                "--output-limit=100", "--junit-output-dir=TestCases/"])
    if gen_tests.returncode != 0:
        return -1
    shutil.copyfile("target/site/jacoco/jacoco.csv", "CoverageReports/jacoco.csv")
    return 0


if __name__ == '__main__':
    sys.exit(main())
