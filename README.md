# BOARD SUPPORT LAYER FOR THE SILICON INFUSION ZMP003 CPU BOARD

This is the YOCTO board support layer for the ZMP003 iMX6Q CPU card.
It is based on the Freescale Community BSP (freescale.github.io), with
an additional target board called 'imx6qzmp003'.

This layer is compatible with the Freescale Community BSP release 2.1
(krogoth).


## BUILD SETUP

Setup the Freescale Community BSP as per their instructions, then edit
the MACHINE variable in <build-dir>/conf/local.conf to be:-

  MACHINE ??= 'imx6qzmp003'

and add this layer to <build-dir>/conf/bblayers.conf with:-

  BBLAYERS += " <layer-dir>/meta-zaltys-zmp003 "

where <layer-dir> is the fully qualified path to the directory which
contains this layer definition.


--
Silicon Infusion Ltd
8 August 2016
