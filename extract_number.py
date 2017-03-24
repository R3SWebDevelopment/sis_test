import sys
import re

OUTPUT_FILENAME = 'numbers.txt'


def read_data(f):
    data = ""
    with open(f, 'r') as input:
        data += input.read()
    return data


def write_data(data):
    with open(OUTPUT_FILENAME, 'w') as output:
        output.write(data)


def main(argv):
    input_fie = argv[1]

    # Read content of the input file
    file_data = read_data(input_fie)

    # Extract only digits from data
    no_digits_pattern = r'(\D)+'
    only_digit_string = re.sub(no_digits_pattern, ',', file_data)

    # Generate list of number
    digits_list = [int(number) for number in only_digit_string.split(',') if number.strip()]

    digits_list.sort()

    # Convert string set to int set
    digits_set = set(digits_list)

    # print "Number and list size tuple: {}".format((digits_set, len(digits_set)))

    # Pair_numbers
    pair_numbers = [number for number in digits_set if number % 2 == 0]

    # Number ending with 5 or 7
    ending_numbers = [number for number in digits_set if number % 10 in [5, 7]]

    output_list = pair_numbers + ending_numbers

    output_list.sort()

    output_data = ','.join(str(v) for v in output_list)

    write_data(output_data)


if __name__ == "__main__":
    main(sys.argv)
