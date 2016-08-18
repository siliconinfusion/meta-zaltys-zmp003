# Copyright (C) 2015 - 2016 Silicon Infusion Ltd
# Released under an MIT licence, see LICENCE file for details.

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Patch the U-Boot source tree to add initial ZMP003 support.
SRC_URI += "file://0001-iMX6Q-ZMP003-board-support.patch"