/*
*	New C++ Header  File starts here.
*	This file should be named robot_supern_n_codegen_protos.hh
*	Automatically generated by NML CodeGen Java Applet.
*	with command line arguments :  HHFile=robot_supern.hh
*
*	.gen script :
*		0:load robot_supern.hh
*		1:clear
*		2:select_from_file robot_supern.hh
*		3:generate C++ protos>robot_supern_n_codegen_protos.hh
*		4:generate C++ format>robot_supern_n.cc
*		5:generate C++ update>robot_supern_n.cc
*		6:generate C++ constructor>robot_supern_n.cc
*		7:exit
*
*/

#ifndef robot_supern_n_codegen_protos_hh_included
#define robot_supern_n_codegen_protos_hh_included

// Include all NML, CMS, and RCS classes and functions
#include "rcs.hh"

// Include command and status message definitions
#include "robot_supern.hh"

// Forward Function Prototypes


#ifndef MAX_ROBOT_SUPERNAME_LENGTH
#define MAX_ROBOT_SUPERNAME_LENGTH 19
#endif
#ifndef ROBOT_SUPERNAME_LIST_LENGTH
#define ROBOT_SUPERNAME_LIST_LENGTH 6
#endif


/* This list must be in alphabetical order and the three lists must correspond. */
extern const NMLTYPE robot_superid_list[ROBOT_SUPERNAME_LIST_LENGTH];
extern const size_t robot_supersize_list[ROBOT_SUPERNAME_LIST_LENGTH];

// Enumerated Type Constants

extern int robot_superFormat(NMLTYPE type, void *buffer, CMS *cms);

#endif
	/* # endif robot_supern_n_codegen_protos_hh_included */ 
