#import unittest

from unittest import TestCase

#class PracticeFirstTest(unittest.TestCase):
class PracticeFirstTest(TestCase):

	def test_sample(self):
		
		self.assertEqual(90,90)
		self.assertTrue(True)
		self.assertFalse(False)
		
		
	
