# Copyright (C) 2015 - 2016 Silicon Infusion Ltd
# Released under an MIT license

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Patch the kernel source tree to include the ZMP003 device tree files.
# This only modifies the device tree descriptions and these are assumed to be 
# stable between kernel revisions - which is why this append file is not tied 
# to a specific kernel release number.
SRC_URI += "file://0001-iMX6Q-ZMP003-device-tree.patch"

# Added kernel configuration fragments
SRC_URI += "file://spi.cfg"
SRC_URI += "file://wifi.cfg"
