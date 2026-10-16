
import unittest

from credit_card_validator import get_card_type, is_valid_card


class TestCreditCardValidator(unittest.TestCase):

    def test_identifies_visa(self):
        self.assertEqual(get_card_type("4388576018410707"), "Visa")

    def test_identifies_mastercard(self):
        self.assertEqual(get_card_type("5123456789012346"), "MasterCard")

    def test_identifies_american_express(self):
        self.assertEqual(get_card_type("371234567890123"), "American Express")

    def test_identifies_discover(self):
        self.assertEqual(get_card_type("6012345678901234"), "Discover")

    def test_rejects_number_that_fails_luhn_check(self):
        self.assertFalse(is_valid_card("4388576018402626"))

    def test_accepts_number_that_passes_luhn_check(self):
        self.assertTrue(is_valid_card("4388576018410707"))

    def test_rejects_number_that_is_too_short(self):
        self.assertFalse(is_valid_card("43885760184"))

    def test_rejects_non_digit_characters(self):
        self.assertFalse(is_valid_card("43885760184107AB"))


if __name__ == "__main__":
    unittest.main()

