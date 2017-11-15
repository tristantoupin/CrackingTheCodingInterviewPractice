#!/usr/bin/env python

# @authors ["Alexis Giguere-Joannette", "Tristan Saumure Toupin"]

import sys
import os


def readFile(fileName):
    f = open(fileName, 'r')
    text = (f.readlines())
    return text


messeages_received = readFile('PracticeInput2.3.txt')
similarities = [0,0,0,0,0]

for i in range (0, 4):
	for j in range(i, 4):
		if (messeages_received[i] == messeages_received[j]):
			similarities[i] += 1

max_number = max(similarities)
print messeages_received[similarities.index(max_number)] + str(max_number+1)

