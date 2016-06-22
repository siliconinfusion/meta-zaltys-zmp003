SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "http://github.com/simplejson/simplejson"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"
DEPENDS = "python3-core"

SRCNAME = "simplejson"
SRC_URI = "https://pypi.python.org/packages/f0/07/26b519e6ebb03c2a74989f7571e6ae6b82e9d7d81b8de6fcdbfc643c7b58/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "53b1371bbf883b129a12d594a97e9a18"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "python3-core"

inherit setuptools3

BBCLASSEXTEND = "native"
