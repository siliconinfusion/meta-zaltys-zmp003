SUMMARY = "Python HTTP for Humans"
HOMEPAGE = "http://python-requests.org"
SECTION = "devel/python"
LICENSE = "Apache2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9bb3515869c0f426cb8441c899ae7f5"
DEPENDS = "python3-core"

SRCNAME = "requests"
SRC_URI = "https://pypi.python.org/packages/49/6f/183063f01aae1e025cf0130772b55848750a2f3a89bfa11b385b35d7329d/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "a36f7a64600f1bfec4d55ae021d232ae"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "python3-core"

inherit setuptools3

BBCLASSEXTEND = "native"
