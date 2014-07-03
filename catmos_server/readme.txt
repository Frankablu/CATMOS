CATMOS Server

Installation Instructions

Install dependencies first.
swi-prolog, boost, lua

Archlinux:
pacman -S swi-prolog boost lua make gcc

Ensure that /usr/bin/swipl exists

Run as root:
make && make install

As normal user:
catmos_server portNumber to run

Mac OS X:
Install Mac Ports: https://www.macports.org
port install swi-prolog boost lua

Mac OS X Note: The server expects /opt/local/bin/swipl to exist.

Run as root:
make && make install

As normal user:
catmos_server portNumber to run

Windows:
Install SWI-Prolog from http://www.swi-prolog.org/
Install vcredist_x86.exe (included in the directory)

Run catmos_server.exe
Use command prompt to call catmos_server portNumber for running multiple copies (Untested on windows)
