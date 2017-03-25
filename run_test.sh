#!/usr/bin/env bash
./generate_file.sh
python extract_number.py base64.txt
java -jar test.jar numbers.txt