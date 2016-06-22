SUMMARY = "An object-oriented HTTP framework"
HOMEPAGE = "http://www.cherrypy.org/"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://cherrypy/LICENSE.txt;md5=49a8cb85ba5e0540493792bd87e71be3"
DEPENDS = "python3-core"

SRCNAME = "CherryPy"
SRC_URI = "https://pypi.python.org/packages/22/57/7b2395e73821d17c9c73e67873dfecdd592f14ddff0af894f952245b5f55/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "e7a11392e40bf2bef7672e31653cf6b0"
SRC_URI[sha256sum] = "f690ce27f9bc203a2f70bbc0fb179b645fac33d8db71efde4d52be47d31e7316"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "python3-core"

inherit setuptools3

FILES_${PN} += "${datadir}/cherrypy"

BBCLASSEXTEND = "native"
