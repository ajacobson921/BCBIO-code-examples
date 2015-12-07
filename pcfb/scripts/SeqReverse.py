#!/usr/bin/env python

ProteinSeq = raw_input('Please put in a DNA sequence.  ')

DNADict={
	'A':'T',
	'C':'G',
	'G':'C',
	'T':'A'
}

result = []
for Nucleotide in ProteinSeq:
	result.append(DNADict[Nucleotide])
string = ''.join(result)

reverse = string[::-1]
print ProteinSeq
print string
#print reverse

