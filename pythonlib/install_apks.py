#! /usr/bin/python

import os, sys
#import commands

command='adb install '

testcase=input("Enter the Directory of the apks: ")

print('=' * 20 + 'BEGIN' + '=' * 20)
for root,dirs,files in os.walk(testcase):
    for f in files:
        if root[-1] != '\\':
            root = root + '\\'
        if os.path.splitext(f)[1] == ".apk":
            print(command + root + f)
            #os.system(command + root + f)
print('=' * 20 + 'END' + '=' * 20)     


