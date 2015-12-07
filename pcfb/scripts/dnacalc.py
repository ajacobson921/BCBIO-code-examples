#! /usr/bin/env python

DNASeq = "ATGAAC"
print 'Sequence:', DNASeq 

SeqLength = float(len(DNASeq))

print "Sequence Length:", SeqLength

NumberA = DNASeq.count('A')
NumberC = DNASeq.count('C')
NumberG = DNASeq.count('G')
NumberT = DNASeq.count('T')

print "A:", NumberA/SeqLength 
print "C:", NumberC/SeqLength
print "G:", NumberG/SeqLength 
print "T:", NumberT/SeqLength

print "A: %.1f" %(100*NumberA/SeqLength), "%"
print "C: %.1f" %(100*NumberC/SeqLength), "%"
print "G: %.1f" %(100*NumberG/SeqLength), "%"
print "T: %.1f" %(100*NumberT/SeqLength), "%"