# Copyright (C) 2015 Silicon Infusion Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Patch the kernel source tree to include the ZMP003 device tree files.
# This only modifies the device tree descriptions and these are assumed to be 
# stable between kernel revisions - which is why this append file is not tied 
# to a specific kernel release number.
SRC_URI += "file://0001-Added-initial-iMX6Q-ZMP003-device-tree.patch"

# Enable user mode SPI operation for all ZMP003 boards.
SRC_URI += "file://spi_spidev.cfg"

