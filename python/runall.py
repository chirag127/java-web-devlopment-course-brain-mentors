"""
This script will compile and run all java files in the current directory and
all subdirectories.
"""

import glob
import os

import subprocess


files = glob.glob("**/*.java", recursive=True)

cwd = os.getcwd()


for file in files:
    print(file)

    subprocess.call(["javac", file])

    print("compiled " + file)

    print("")

    cd = os.path.dirname(file)

    os.chdir(cd)

    subprocess.call(["java", os.path.basename(file).replace(".java", "")])

    os.chdir(cwd)

    print("ran " + file)

    print("")

    print("")

    print("")
