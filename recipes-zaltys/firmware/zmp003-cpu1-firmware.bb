SUMMARY = "Firmware images for the ZMP003-CPU1 Spartan6 FPGA."
LICENSE = "MIT"

SILICON_INFUSION_OPEN_HOST ??= "git://github.com/siliconinfusion"

SRC_URI = "${SILICON_INFUSION_OPEN_HOST}/zmp003-cpu1-firmware.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=9f99a6147d76cdf62362534311e782bc"

S = "${WORKDIR}/git"

do_configure() {
}

do_compile() {
}

do_install() {
    install -d ${D}${sbindir}
    install -d ${D}${datadir}/zaltys
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub

    install -m 0755 spi-hub/flash-zmp003-cpu1-spi-hub ${D}${sbindir}

    install spi-hub/images ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub
}

FILES_${PN} += "${datadir}/zaltys/zmp003-cpu1-firmware"
