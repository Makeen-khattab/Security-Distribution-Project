# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!

# Documentaintion variables 
SUMMARY     = ""
DESCRIPTION = ""
HOMEPAGE    = ""


# LICENSE variables

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "file://main.cpp"


# Dependencies

DEPENDS="openssl"



# SOURCECODE variables


# Tasks executed through bitbake




# Modify these as desired
PV = "1.0"

# This is for the purporse of choosing a specific commit object from the branch we are to fetch it
# SRCREV = "" 

S = "${WORKDIR}"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {

    ${CXX} ${S}/main.cpp -lssl -lcrypto -o hellossl 
	

}

do_install () {
	# Specify install commands here
	:
	
}

do_package_qa[noexec]="1"
