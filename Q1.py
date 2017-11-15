import os
import sys

def readFile(fileName):
    f = open(fileName, 'r')
    text = (f.read())
    return ''.join(c for c in text if c.isdegit())


print (readFile('PracticeInput.txt'))

