require xorg-app-common.inc

SUMMARY = "XRandR: X Resize, Rotate and Reflect extension command"

DESCRIPTION = "Xrandr is used to set the size, orientation and/or \
reflection of the outputs for a screen. It can also set the screen \
size."

LICENSE= "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=fe1608bdb33cf8c62a4438f7d34679b3"
DEPENDS += "libxrandr libxrender"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[md5sum] = "4d68317238bb14a33c0e419233d57d87"
SRC_URI[sha256sum] = "a76b004abe6fd7606eba9ad161ac6391fe5c665708cc5fb7c7ea7d36459d9693"
