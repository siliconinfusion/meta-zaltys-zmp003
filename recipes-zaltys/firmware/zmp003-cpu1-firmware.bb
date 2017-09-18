SUMMARY = "Firmware images for the ZMP003-CPU1 Spartan6 FPGA."
LICENSE = "MIT"

SILICON_INFUSION_OPEN_HOST ??= "git://github.com/siliconinfusion"

SRC_URI = "${SILICON_INFUSION_OPEN_HOST}/zmp003-cpu1-firmware.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=9f99a6147d76cdf62362534311e782bc"

S = "${WORKDIR}/git"

inherit update-rc.d
INITSCRIPT_NAME = "zmp003-fpga1"
INITSCRIPT_PARAMS = "defaults"

do_install() {
    install -d ${D}${sbindir}
    install -m 0755 spi-hub/zmp003-flash-cpu1-spi-hub ${D}${sbindir}
    install -m 0755 spi-hub/zmp003-reload-cpu1-spi-hub ${D}${sbindir}
    install -m 0755 spi-hub/zmp003-reload-fpga1-primary ${D}${sbindir}
    install -m 0755 spi-hub/zmp003-reload-fpga1-secondary ${D}${sbindir}

    install -d ${D}${datadir}/zaltys
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub/images
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub/images/legacy
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub/images/legacy/v2
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub/images/legacy/v3
    install -d ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub/images/v1_3
    install spi-hub/images/legacy/v2/zmp003_cpu1_spi_hub.image ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub/images/legacy/v2
    install spi-hub/images/legacy/v3/zmp003_cpu1_spi_hub.image ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub/images/legacy/v3
    install spi-hub/images/v1_3/zmp003_cpu1_spi_hub.image ${D}${datadir}/zaltys/zmp003-cpu1-firmware/spi-hub/images/v1_3

    install -d ${D}${sysconfdir}
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 spi-hub/init.d/${INITSCRIPT_NAME} ${D}${sysconfdir}/init.d
}

FILES_${PN} += "${datadir}/zaltys/zmp003-cpu1-firmware"
