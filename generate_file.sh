#!/usr/bin/env bash

: ${FILE_SIZE:="5MB"}
: ${FILE_BASE_NAME:="base64"}
: ${FILE_TXT_NAME:="${FILE_BASE_NAME}.txt"}
: ${FILE_TAR_NAME:="${FILE_BASE_NAME}.tar"}


# Generate file of certain size
base64 /dev/urandom | head -c ${FILE_SIZE} > ${FILE_TXT_NAME}
# Change permission to read only
chmod 444 ${FILE_TXT_NAME}
# Tar ball generated file
tar -cf ${FILE_TAR_NAME} ${FILE_TXT_NAME}
# Print MD5 checksum
: ${TAR_FILE_CHECKSUM:=$(md5sum "${FILE_TAR_NAME}" | grep --only-matching -m 1 '^[0-9a-f]*')}
echo "MD5 Checksum for file ${FILE_TAR_NAME}: ${TAR_FILE_CHECKSUM}"

: ${EPOCH_TIME:="$(date +%s).tar"}
mv ${FILE_TAR_NAME} ${EPOCH_TIME}