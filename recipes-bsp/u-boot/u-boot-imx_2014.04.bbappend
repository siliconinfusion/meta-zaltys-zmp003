# Copyright (C) 2015 Silicon Infusion Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Patch the U-Boot source tree to add initial ZMP003 support.
SRC_URI += "file://0001-Added-initial-iMX6Q-ZMP003-board-support.patch"