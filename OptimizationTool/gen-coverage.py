#!/usr/bin/python3
import shutil
import subprocess
import sys


def main():
    clean_covg = subprocess.run(["mvn", "clean"])
    if clean_covg.returncode != 0:
        return -1
    gen_covg = subprocess.run(["mvn", "test"])
    if gen_covg.returncode != 0:
        return -1
    shutil.copyfile("target/site/jacoco/jacoco.csv", "CoverageReports/jacoco.csv")
    return 0


if __name__ == '__main__':
    sys.exit(main())
