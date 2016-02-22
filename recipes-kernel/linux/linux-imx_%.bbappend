# Copyright (C) 2015 Silicon Infusion Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Patch the kernel source tree to include the ZMP003 device tree files.
# This only modifies the device tree descriptions and these are assumed to be 
# stable between kernel revisions - which is why this append file is not tied 
# to a specific kernel release number.
SRC_URI += "file://0001-Added-initial-iMX6Q-ZMP003-device-tree.patch"

# Append our own kernel configuration options manually to the defconfig file.
#
# Doing this horrible hack because the Freescale Yocto recipes seem not to
# support the standard Yocto mechanism of using kernel config fragments.
#
do_compile_prepend() {
  echo ""                                      >>${S}/../defconfig
  echo "# Silicon Infusion Zaltys ZMP003-CPU1" >>${S}/../defconfig
  echo "CONFIG_SPI_SPIDEV=y"                   >>${S}/../defconfig
  echo "CONFIG_RTL8192CU=m"                    >>${S}/../defconfig
  echo "CONFIG_RTLWIFI=m"                      >>${S}/../defconfig
  echo "CONFIG_RTLWIFI_USB=m"                  >>${S}/../defconfig
  echo "CONFIG_RTLWIFI_DEBUG=n"                >>${S}/../defconfig
  echo "CONFIG_RTL8192C_COMMON=m"              >>${S}/../defconfig
  echo "CONFIG_WEXT_CORE=y"                    >>${S}/../defconfig
  echo "CONFIG_WEXT_PROC=y"                    >>${S}/../defconfig
  echo "CONFIG_CFG80211_WEXT=y"                >>${S}/../defconfig

  echo ""                                      >>${S}/.config
  echo "# Silicon Infusion Zaltys ZMP003-CPU1" >>${S}/.config
  echo "CONFIG_SPI_SPIDEV=y"                   >>${S}/.config
  echo "CONFIG_RTL8192CU=m"                    >>${S}/.config
  echo "CONFIG_RTLWIFI=m"                      >>${S}/.config
  echo "CONFIG_RTLWIFI_USB=m"                  >>${S}/.config
  echo "CONFIG_RTLWIFI_DEBUG=n"                >>${S}/.config
  echo "CONFIG_RTL8192C_COMMON=m"              >>${S}/.config
  echo "CONFIG_WEXT_CORE=y"                    >>${S}/.config
  echo "CONFIG_WEXT_PROC=y"                    >>${S}/.config
  echo "CONFIG_CFG80211_WEXT=y"                >>${S}/.config
}
