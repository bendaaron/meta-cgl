DESCRIPTION = "MailTools is a set of Perl modules related to mail applications"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"
DEPENDS = " \
	libtest-pod-perl-native \
	libtimedate-perl-native \
	"	
RDEPENDS_${PN} += " \
	libtest-pod-perl \
	libtimedate-perl \
	perl-module-io-handle \
	perl-module-net-smtp \
	perl-module-test-more \
	"
BBCLASSEXTEND = "native"
PR = "r1"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/M/MA/MARKOV/MailTools-${PV}.tar.gz"
SRC_URI[md5sum] = "5d6fbdc56c6e1208e684012437b67e30"
SRC_URI[sha256sum] = "7216404681bebce4e09651e1619c3e1eebe2a7e3856f1233af0dd9660ba052b6"

S = "${WORKDIR}/MailTools-${PV}"

inherit cpan

PACKAGE_ARCH = "all"
