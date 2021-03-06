
----------------------------------------------------------------------------
--  This file is a part of the LEON VHDL model
--  Copyright (C) 1999  European Space Agency (ESA)
--
--  This library is free software; you can redistribute it and/or
--  modify it under the terms of the GNU Lesser General Public
--  License as published by the Free Software Foundation; either
--  version 2 of the License, or (at your option) any later version.
--
--  See the file COPYING.LGPL for the full details of the license.



library ieee;
use ieee.std_logic_1164.all;
entity ftreg is 
  port ( 
    clk  : in std_logic; 
    d  : in std_logic; 
    q : out std_logic ); 
end;



