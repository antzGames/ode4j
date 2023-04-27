/*************************************************************************
 *                                                                       *
 * Open Dynamics Engine, Copyright (C) 2001,2002 Russell L. Smith.       *
 * All rights reserved.  Email: russ@q12.org   Web: www.q12.org          *
 * Open Dynamics Engine 4J, Copyright (C) 2009-2014 Tilmann Zaeschke     *
 * All rights reserved.  Email: ode4j@gmx.de   Web: www.ode4j.org        *
 *                                                                       *
 * This library is free software; you can redistribute it and/or         *
 * modify it under the terms of EITHER:                                  *
 *   (1) The GNU Lesser General Public License as published by the Free  *
 *       Software Foundation; either version 2.1 of the License, or (at  *
 *       your option) any later version. The text of the GNU Lesser      *
 *       General Public License is included with this library in the     *
 *       file LICENSE.TXT.                                               *
 *   (2) The BSD-style license that is included with this library in     *
 *       the file ODE-LICENSE-BSD.TXT and ODE4J-LICENSE-BSD.TXT.         *
 *                                                                       *
 * This library is distributed in the hope that it will be useful,       *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the files    *
 * LICENSE.TXT, ODE-LICENSE-BSD.TXT and ODE4J-LICENSE-BSD.TXT for more   *
 * details.                                                              *
 *                                                                       *
 *************************************************************************/
package org.ode4j.demo;

// mesh for a world model, to be used with test_cyl.cpp
class WorldGeom3 {
static float world_vertices[] = {
	10.000000f,-10.000000f,1.000000f,
	-10.000000f,-10.000000f,1.000000f,
	-10.000000f,-10.000000f,-1.000000f,
	-10.000000f,-10.000000f,-1.000000f,
	10.000000f,-10.000000f,-1.000000f,
	10.000000f,-10.000000f,1.000000f,
	10.000000f,10.000000f,1.000000f,
	10.000000f,-10.000000f,1.000000f,
	10.000000f,-10.000000f,-1.000000f,
	10.000000f,-10.000000f,-1.000000f,
	10.000000f,10.000000f,-1.000000f,
	10.000000f,10.000000f,1.000000f,
	10.000000f,10.000000f,-1.000000f,
	10.000000f,-10.000000f,-1.000000f,
	-10.000000f,-10.000000f,-1.000000f,
	-10.000000f,-10.000000f,-1.000000f,
	-10.000000f,10.000000f,-1.000000f,
	10.000000f,10.000000f,-1.000000f,
	0.000000f,9.000000f,-0.000000f,
	0.000000f,-9.000000f,0.000000f,
	9.000000f,-9.000000f,0.000000f,
	0.000000f,9.000000f,-0.000000f,
	9.000000f,-9.000000f,0.000000f,
	9.000000f,9.000000f,-0.000000f,
	10.000000f,10.000000f,-1.000000f,
	-10.000000f,10.000000f,-1.000000f,
	-10.000000f,10.000000f,1.000000f,
	10.000000f,10.000000f,-1.000000f,
	-10.000000f,10.000000f,1.000000f,
	10.000000f,10.000000f,1.000000f,
	-10.000000f,-10.000000f,-1.000000f,
	-10.000000f,-10.000000f,1.000000f,
	-10.000000f,10.000000f,1.000000f,
	-10.000000f,10.000000f,1.000000f,
	-10.000000f,10.000000f,-1.000000f,
	-10.000000f,-10.000000f,-1.000000f,
	9.000000f,-9.000000f,1.000000f,
	-9.000000f,-9.000000f,1.000000f,
	10.000000f,-10.000000f,1.000000f,
	-9.000000f,-9.000000f,1.000000f,
	-10.000000f,-10.000000f,1.000000f,
	10.000000f,-10.000000f,1.000000f,
	9.000000f,9.000000f,1.000000f,
	9.000000f,-9.000000f,1.000000f,
	10.000000f,-10.000000f,1.000000f,
	10.000000f,-10.000000f,1.000000f,
	10.000000f,10.000000f,1.000000f,
	9.000000f,9.000000f,1.000000f,
	-9.000000f,9.000000f,1.000000f,
	9.000000f,9.000000f,1.000000f,
	10.000000f,10.000000f,1.000000f,
	10.000000f,10.000000f,1.000000f,
	-10.000000f,10.000000f,1.000000f,
	-9.000000f,9.000000f,1.000000f,
	-9.000000f,9.000000f,1.000000f,
	-10.000000f,10.000000f,1.000000f,
	-9.000000f,-9.000000f,1.000000f,
	-10.000000f,10.000000f,1.000000f,
	-10.000000f,-10.000000f,1.000000f,
	-9.000000f,-9.000000f,1.000000f,
	0.000000f,-9.000000f,0.000000f,
	-9.000000f,-9.000000f,0.000000f,
	-9.000000f,-9.000000f,1.000000f,
	0.000000f,-9.000000f,0.000000f,
	-9.000000f,-9.000000f,1.000000f,
	9.000000f,-9.000000f,1.000000f,
	0.000000f,-9.000000f,0.000000f,
	9.000000f,-9.000000f,1.000000f,
	9.000000f,-9.000000f,0.000000f,
	9.000000f,-9.000000f,0.000000f,
	9.000000f,-9.000000f,1.000000f,
	9.000000f,9.000000f,1.000000f,
	9.000000f,9.000000f,1.000000f,
	9.000000f,9.000000f,-0.000000f,
	9.000000f,-9.000000f,0.000000f,
	0.000000f,9.000000f,-0.000000f,
	9.000000f,9.000000f,-0.000000f,
	9.000000f,9.000000f,1.000000f,
	0.000000f,9.000000f,-0.000000f,
	9.000000f,9.000000f,1.000000f,
	-9.000000f,9.000000f,1.000000f,
	0.000000f,9.000000f,-0.000000f,
	-9.000000f,9.000000f,1.000000f,
	-9.000000f,9.000000f,-0.000000f,
	-9.000000f,9.000000f,1.000000f,
	-9.000000f,-9.000000f,1.000000f,
	-9.000000f,-9.000000f,0.000000f,
	-9.000000f,-9.000000f,0.000000f,
	-9.000000f,9.000000f,-0.000000f,
	-9.000000f,9.000000f,1.000000f,
	-2.997000f,-1.748874f,0.000000f,
	-2.997000f,-2.001000f,0.000000f,
	0.000000f,-9.000000f,0.000000f,
	-2.997000f,-1.748874f,0.000000f,
	0.000000f,-9.000000f,0.000000f,
	-2.997000f,1.748874f,-0.000000f,
	-2.997000f,-2.001000f,0.000000f,
	-2.997000f,-6.003000f,0.002697f,
	0.000000f,-9.000000f,0.000000f,
	0.000000f,9.000000f,-0.000000f,
	-2.997000f,2.001000f,-0.000000f,
	-2.997000f,1.748874f,-0.000000f,
	0.000000f,9.000000f,-0.000000f,
	-2.997000f,1.748874f,-0.000000f,
	0.000000f,-9.000000f,0.000000f,
	-2.997000f,2.001000f,-0.000000f,
	0.000000f,9.000000f,-0.000000f,
	-2.997000f,6.003000f,0.002697f,
	-6.003000f,6.003000f,0.002697f,
	-2.997000f,6.003000f,0.002697f,
	0.000000f,9.000000f,-0.000000f,
	0.000000f,9.000000f,-0.000000f,
	-9.000000f,9.000000f,-0.000000f,
	-6.003000f,6.003000f,0.002697f,
	-6.003000f,1.748874f,-0.000000f,
	-9.000000f,-9.000000f,0.000000f,
	-6.003000f,-1.748874f,0.000000f,
	-6.003000f,2.001000f,-0.000000f,
	-6.003000f,6.003000f,0.002697f,
	-9.000000f,9.000000f,-0.000000f,
	-9.000000f,9.000000f,-0.000000f,
	-6.003000f,1.748874f,-0.000000f,
	-6.003000f,2.001000f,-0.000000f,
	-9.000000f,9.000000f,-0.000000f,
	-9.000000f,-9.000000f,0.000000f,
	-6.003000f,1.748874f,-0.000000f,
	-9.000000f,-9.000000f,0.000000f,
	-6.003000f,-6.003000f,0.002697f,
	-6.003000f,-2.001000f,0.000000f,
	-9.000000f,-9.000000f,0.000000f,
	-6.003000f,-2.001000f,0.000000f,
	-6.003000f,-1.748874f,0.000000f,
	-6.003000f,-6.003000f,0.002697f,
	-9.000000f,-9.000000f,0.000000f,
	0.000000f,-9.000000f,0.000000f,
	-6.003000f,-6.003000f,0.002697f,
	0.000000f,-9.000000f,0.000000f,
	-2.997000f,-6.003000f,0.002697f,
	-2.997000f,1.748874f,1.237951f,
	-2.997000f,1.748874f,-0.000000f,
	-2.997000f,2.001000f,-0.000000f,
	-2.997000f,1.748874f,1.237951f,
	-2.997000f,2.001000f,-0.000000f,
	-2.997000f,2.001000f,1.515748f,
	-6.003000f,-2.001000f,1.515748f,
	-6.003000f,-6.003000f,0.002697f,
	-2.997000f,-6.003000f,0.002697f,
	-6.003000f,-2.001000f,1.515748f,
	-2.997000f,-6.003000f,0.002697f,
	-2.997000f,-2.001000f,1.515748f,
	-2.997000f,2.001000f,1.515748f,
	-2.997000f,6.003000f,0.002697f,
	-6.003000f,6.003000f,0.002697f,
	-6.003000f,6.003000f,0.002697f,
	-6.003000f,2.001000f,1.515748f,
	-2.997000f,2.001000f,1.515748f,
	-6.003000f,-2.001000f,0.000000f,
	-6.003000f,-6.003000f,0.002697f,
	-6.003000f,-2.001000f,1.515748f,
	-6.003000f,2.001000f,1.515748f,
	-6.003000f,6.003000f,0.002697f,
	-6.003000f,2.001000f,-0.000000f,
	-2.997000f,-2.001000f,1.515748f,
	-2.997000f,-6.003000f,0.002697f,
	-2.997000f,-2.001000f,0.000000f,
	-2.997000f,2.001000f,-0.000000f,
	-2.997000f,6.003000f,0.002697f,
	-2.997000f,2.001000f,1.515748f,
	-2.997000f,-2.001000f,1.515748f,
	-2.997000f,2.001000f,1.515748f,
	-6.003000f,2.001000f,1.515748f,
	-6.003000f,2.001000f,1.515748f,
	-6.003000f,-2.001000f,1.515748f,
	-2.997000f,-2.001000f,1.515748f,
	-2.997000f,-1.748874f,1.237951f,
	-2.997000f,1.748874f,1.237951f,
	-2.997000f,2.001000f,1.515748f,
	-2.997000f,-1.748874f,1.237951f,
	-2.997000f,2.001000f,1.515748f,
	-2.997000f,-2.001000f,1.515748f,
	-6.003000f,-1.748874f,1.237951f,
	-6.003000f,-1.748874f,0.000000f,
	-6.003000f,-2.001000f,0.000000f,
	-6.003000f,-1.748874f,1.237951f,
	-6.003000f,-2.001000f,0.000000f,
	-6.003000f,-2.001000f,1.515748f,
	-2.997000f,-2.001000f,1.515748f,
	-2.997000f,-2.001000f,0.000000f,
	-2.997000f,-1.748874f,1.237951f,
	-2.997000f,-2.001000f,0.000000f,
	-2.997000f,-1.748874f,0.000000f,
	-2.997000f,-1.748874f,1.237951f,
	-6.003000f,1.748874f,1.237951f,
	-6.003000f,2.001000f,1.515748f,
	-6.003000f,2.001000f,-0.000000f,
	-6.003000f,1.748874f,1.237951f,
	-6.003000f,2.001000f,-0.000000f,
	-6.003000f,1.748874f,-0.000000f,
	-6.003000f,1.748874f,1.237951f,
	-6.003000f,-1.748874f,1.237951f,
	-6.003000f,-2.001000f,1.515748f,
	-6.003000f,1.748874f,1.237951f,
	-6.003000f,-2.001000f,1.515748f,
	-6.003000f,2.001000f,1.515748f,
	-6.003000f,1.748874f,1.237951f,
	-6.003000f,1.748874f,-0.000000f,
	-2.997000f,1.748874f,1.237951f,
	-6.003000f,1.748874f,-0.000000f,
	-2.997000f,1.748874f,-0.000000f,
	-2.997000f,1.748874f,1.237951f,
	-6.003000f,1.748874f,-0.000000f,
	-6.003000f,-1.748874f,0.000000f,
	-2.997000f,-1.748874f,0.000000f,
	-6.003000f,1.748874f,-0.000000f,
	-2.997000f,-1.748874f,0.000000f,
	-2.997000f,1.748874f,-0.000000f,
	-6.003000f,-1.748874f,0.000000f,
	-6.003000f,-1.748874f,1.237951f,
	-2.997000f,-1.748874f,1.237951f,
	-2.997000f,-1.748874f,1.237951f,
	-2.997000f,-1.748874f,0.000000f,
	-6.003000f,-1.748874f,0.000000f,
	-6.003000f,-1.748874f,1.237951f,
	-6.003000f,1.748874f,1.237951f,
	-2.997000f,-1.748874f,1.237951f,
	-6.003000f,1.748874f,1.237951f,
	-2.997000f,1.748874f,1.237951f,
	-2.997000f,-1.748874f,1.237951f};

static float world_normals[] = {
	0.000000f,-1.000000f,0.000000f,
	-0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,-0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000225f,0.000161f,1.000000f,
	0.000225f,-0.000161f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000225f,0.000161f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	-0.000000f,0.000000f,1.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,-0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,-0.000000f,
	-1.000000f,0.000000f,0.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,-0.000000f,
	-1.000000f,0.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,-0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	-0.000000f,0.000000f,1.000000f,
	0.000787f,0.000337f,1.000000f,
	0.000225f,-0.000161f,1.000000f,
	-0.000000f,0.000000f,1.000000f,
	0.000225f,-0.000161f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000787f,0.000337f,1.000000f,
	0.000400f,-0.179805f,0.983702f,
	0.000225f,-0.000161f,1.000000f,
	0.000225f,0.000161f,1.000000f,
	0.000787f,-0.000337f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000225f,0.000161f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000225f,-0.000161f,1.000000f,
	0.000787f,-0.000337f,1.000000f,
	0.000225f,0.000161f,1.000000f,
	0.000532f,0.119686f,0.992812f,
	-0.000320f,0.143927f,0.989588f,
	0.000532f,0.119686f,0.992812f,
	0.000225f,0.000161f,1.000000f,
	0.000225f,0.000161f,1.000000f,
	-0.000393f,0.000056f,1.000000f,
	-0.000320f,0.143927f,0.989588f,
	-0.000000f,0.000000f,1.000000f,
	-0.000315f,-0.000045f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	-0.000787f,-0.000337f,1.000000f,
	-0.000320f,0.143927f,0.989588f,
	-0.000393f,0.000056f,1.000000f,
	-0.000393f,0.000056f,1.000000f,
	-0.000000f,0.000000f,1.000000f,
	-0.000787f,-0.000337f,1.000000f,
	-0.000393f,0.000056f,1.000000f,
	-0.000315f,-0.000045f,1.000000f,
	-0.000000f,0.000000f,1.000000f,
	-0.000315f,-0.000045f,1.000000f,
	-0.000398f,-0.089784f,0.995961f,
	-0.000787f,0.000337f,1.000000f,
	-0.000315f,-0.000045f,1.000000f,
	-0.000787f,0.000337f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	-0.000398f,-0.089784f,0.995961f,
	-0.000315f,-0.000045f,1.000000f,
	0.000225f,-0.000161f,1.000000f,
	-0.000398f,-0.089784f,0.995961f,
	0.000225f,-0.000161f,1.000000f,
	0.000400f,-0.179805f,0.983702f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	0.000000f,-0.239222f,0.970965f,
	-0.000398f,-0.089784f,0.995961f,
	0.000400f,-0.179805f,0.983702f,
	0.000000f,-0.239222f,0.970965f,
	0.000400f,-0.179805f,0.983702f,
	0.000000f,-0.119611f,0.992821f,
	0.000000f,0.239222f,0.970965f,
	0.000532f,0.119686f,0.992812f,
	-0.000320f,0.143927f,0.989588f,
	-0.000320f,0.143927f,0.989588f,
	0.000000f,0.119611f,0.992821f,
	0.000000f,0.239222f,0.970965f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	0.000000f,-0.119611f,0.992821f,
	0.000000f,0.239222f,0.970965f,
	0.000000f,0.119611f,0.992821f,
	0.000000f,0.119611f,0.992821f,
	0.000000f,-0.239222f,0.970965f,
	0.000000f,-0.119611f,0.992821f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,-0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	1.000000f,-0.000000f,0.000000f,
	1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	-1.000000f,0.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	0.000000f,-1.000000f,0.000000f,
	-0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	-0.000000f,0.000000f,1.000000f,
	-0.000000f,0.000000f,1.000000f,
	-0.000000f,0.000000f,1.000000f,
	0.000000f,0.000000f,1.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,1.000000f,0.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f,
	0.000000f,0.000000f,-1.000000f};


//static dTriIndex world_indices[] = {
static int world_indices[] = {
	0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
	20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,
	40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,
	60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,
	80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,
	100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,
	120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,
	140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,
	160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,
	180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,
	200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,
	220,221,222,223,224,225,226,227};
}
