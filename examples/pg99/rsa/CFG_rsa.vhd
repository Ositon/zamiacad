-- File>>> CFG_rsa_RTL.vhd
--
-- Date:   Tue Nov 10 19:11:35 MET 1998
-- Author: wackerao
--
-- Revision history:
--
-- $Source$
-- $Revision$
-- $Log$
--
--

library IEEE;
use IEEE.std_logic_1164.all;
use IEEE.std_logic_arith.all;

library LIB_rsa;
-- use LIB_rsa.PCK_rsa.all;

configuration CFG_rsa of rsa is
  for BEHAV
  end for;
end CFG_rsa;

configuration CFG_RSA_RTL of rsa is
  for RTL
      for DATAIN_MUX, MUX_C_REG_M, MUX_C_REG_A, MUX_C_CLA_B, MUX_C_CLA_M,
	  MUX_C_M_OUT_SEL, MUX_C_AB_CLA : MUX16_2to1
	  use entity WORK.MUX16_2to1(BEHAV);	-- BEHAV = RTL
      end for;
      for MUX_C_REG_IN : MUX16_4to1
	  use entity WORK.MUX16_4to1(BEHAV);	-- BEHAV = RTL
      end for;
      for M_REG768, A_REG768, B_REG768 : REG_768
	  use entity WORK.REG_768(RTL_HIER);	-- RTL
      end for;
      for E_REG32 : REG_32
	  use entity WORK.REG_32(BEHAV);	-- BEHAV = RTL
      end for;
      for REG16_CLA_B, REG16_CLA_M, CLA_REG16 : REG_16
	  use entity WORK.REG_16(BEHAV);	-- BEHAV = RTL
      end for;      
      for MUX_C_OUT : MUX32_2to1
	  use entity WORK.MUX32_2to1(BEHAV);	-- BEHAV = RTL
      end for;
      for BitSel_MUX: MUX_1536to1
	  use entity WORK.MUX_1536to1(BEHAV);	-- BEHAV = RTL
      end for;
      for Carry_REG1 : REG_1
	  use entity WORK.REG_1(BEHAV);		-- BEHAV = RTL
      end for;
      for MONT_MUL : MONTGOMERY
	  use entity WORK.MONTGOMERY(BEHAVIOURAL);
      end for;
      for XOR_16 : XOR16_1
	  use entity WORK.XOR16_1(BEHAV);	-- BEHAV = RTL
      end for;      
      for SEL_RI1_MUX, SEL_RI2_MUX : MUX768to16
	  use entity WORK.MUX768to16(BEHAV);	-- ??
      end for;
      for CLA16 : CLA_16
	  use entity WORK.CLA_16(RTL);
      end for;
      for MUX_C_CLACARRY: MUX1_2to1
	  use entity WORK.MUX1_2to1(BEHAV);	-- BEHAV = RTL
      end for;
      for STEUERWERK : STRG
	  use entity WORK.STRG(RTL);
      end for;      
  end for;
end CFG_RSA_RTL;



