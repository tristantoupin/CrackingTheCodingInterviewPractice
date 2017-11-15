#!/usr/bin/env python

# @authors ["Alexis Giguere-Joannette", "Tristan Saumure Toupin"]

import sys
import os


filename = sys.argv[1]
file = open(filename, 'r')
str = file.read()
file.close()


strArray = str.replace("\r", "")
strArray = strArray.split("\n")


for x in strArray:
	if strArray.index(x) != 0:
		x = x.split(',')
		print x
		x1 = '{0:32b}'.format(int(x[0]))
		x2 = '{0:32b}'.format(int(x[1]))
		print int(x1)
		print int(x2)
		total = int(x1) & int(x2)
		print total
		break


