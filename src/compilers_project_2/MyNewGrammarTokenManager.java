/* Generated By:JJTree&JavaCC: Do not edit this line. MyNewGrammarTokenManager.java */
package compilers_project_2;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

/** Token Manager. */
public class MyNewGrammarTokenManager implements MyNewGrammarConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 0;
            return 6;
         }
         if ((active0 & 0x1fff7e0000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 0;
            return 9;
         }
         if ((active0 & 0x400000000000100L) != 0L)
            return 13;
         return -1;
      case 1:
         if ((active0 & 0x1ffefe0000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 1;
            return 9;
         }
         if ((active0 & 0x1000000000L) != 0L)
            return 9;
         return -1;
      case 2:
         if ((active0 & 0x1fc27e0000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 50;
               jjmatchedPos = 2;
            }
            return 9;
         }
         if ((active0 & 0x3c800000000L) != 0L)
            return 9;
         return -1;
      case 3:
         if ((active0 & 0x17aa5e0000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 3;
            return 9;
         }
         if ((active0 & 0x840200000000L) != 0L)
            return 9;
         return -1;
      case 4:
         if ((active0 & 0x7aa520000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 4;
            return 9;
         }
         if ((active0 & 0x10000c0000000L) != 0L)
            return 9;
         return -1;
      case 5:
         if ((active0 & 0xaa420000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 5;
            return 9;
         }
         if ((active0 & 0x700100000000L) != 0L)
            return 9;
         return -1;
      case 6:
         if ((active0 & 0x2a000000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 6;
            return 9;
         }
         if ((active0 & 0x80420000000L) != 0L)
            return 9;
         return -1;
      case 7:
         if ((active0 & 0xa000000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 7;
            return 9;
         }
         if ((active0 & 0x20000000000L) != 0L)
            return 9;
         return -1;
      case 8:
         if ((active0 & 0x8000000000L) != 0L)
            return 9;
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 8;
            return 9;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 4);
      case 33:
         {
         jjmatchedKind = 28;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 37:
         return jjStopAtPos(0, 9);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 40:
         return jjStopAtPos(0, 14);
      case 41:
         return jjStopAtPos(0, 15);
      case 42:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 5);
      case 44:
         return jjStopAtPos(0, 12);
      case 45:
         return jjStopAtPos(0, 6);
      case 46:
         return jjStopAtPos(0, 13);
      case 47:
         {
         jjmatchedKind = 8;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x400000000000000L);
      case 59:
         return jjStopAtPos(0, 11);
      case 60:
         {
         jjmatchedKind = 20;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 61:
         {
         jjmatchedKind = 10;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 62:
         {
         jjmatchedKind = 22;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 91:
         return jjStopAtPos(0, 16);
      case 93:
         return jjStopAtPos(0, 17);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x60000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x600000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xf000000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x70000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x300000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 123:
         return jjStopAtPos(0, 18);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 125:
         return jjStopAtPos(0, 19);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         break;
      case 42:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         break;
      case 61:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x330000000000L);
      case 102:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 36, 9);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x280000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x800920000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80040000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 124:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x100080000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1880000000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 114:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 9);
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 116:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x208400000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 119:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x20040000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 100:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 47, 9);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      case 101:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 9);
         return jjMoveStringLiteralDfa4_0(active0, 0x8400000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      case 108:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 9);
         return jjMoveStringLiteralDfa4_0(active0, 0x1002020000000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 48, 9);
         return jjMoveStringLiteralDfa5_0(active0, 0x2020000000L);
      case 107:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 9);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x100100000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x400400000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x228000000000L);
      case 115:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 9);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 101:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 9);
         break;
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 103:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 46, 9);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000000L);
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 44, 9);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 45, 9);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x28000000000L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000000L);
      case 110:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(6, 29, 9);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 43, 9);
         break;
      case 115:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(6, 34, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000000L);
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000000L);
      case 121:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 41, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 39, 9);
         break;
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 37, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 35;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddStates(0, 6);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(11, 12);
                  if (curChar == 48)
                     jjAddStates(7, 8);
                  break;
               case 6:
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(11, 12);
                  break;
               case 11:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(11, 12);
                  break;
               case 12:
                  if (curChar == 34 && kind > 53)
                     kind = 53;
                  break;
               case 13:
                  if (curChar != 47)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(14);
                  break;
               case 14:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(14);
                  break;
               case 15:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 16:
                  if (curChar == 48)
                     jjAddStates(7, 8);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddStates(0, 6);
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(21);
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(22, 23);
                  break;
               case 24:
                  if (curChar == 43)
                     jjCheckNAdd(25);
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(25);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(26, 27);
                  break;
               case 27:
                  if (curChar != 46)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(28);
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(28);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(29, 30);
                  break;
               case 30:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 33:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(34);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(34);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     jjCheckNAdd(9);
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     jjCheckNAdd(9);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 0:
                  if (curChar == 101 && kind > 49)
                     kind = 49;
                  break;
               case 1:
                  if (curChar == 117)
                     jjCheckNAdd(0);
                  break;
               case 2:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 4:
                  if (curChar == 115)
                     jjCheckNAdd(0);
                  break;
               case 5:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 7:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAdd(9);
                  break;
               case 11:
                  jjAddStates(9, 10);
                  break;
               case 14:
                  if (kind > 57)
                     kind = 57;
                  jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 17:
                  if (curChar == 120)
                     jjCheckNAdd(18);
                  break;
               case 18:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(18);
                  break;
               case 19:
                  if (curChar == 88)
                     jjCheckNAdd(18);
                  break;
               case 23:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 32:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(11, 12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 11:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(9, 10);
                  break;
               case 14:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjstateSet[jjnewStateCnt++] = 14;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 35 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x800000000000000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   21, 22, 23, 26, 27, 29, 30, 17, 19, 11, 12, 33, 34, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\12", "\53", "\55", "\52", "\57", "\45", "\75", "\73", 
"\54", "\56", "\50", "\51", "\133", "\135", "\173", "\175", "\74", "\74\75", "\76", 
"\76\75", "\75\75", "\41\75", "\46\46", "\174\174", "\41", 
"\142\157\157\154\145\141\156", "\142\162\145\141\153", "\143\154\141\163\163", "\144\157\165\142\154\145", 
"\145\154\163\145", "\145\170\164\145\156\144\163", "\146\157\162", "\151\146", 
"\151\155\160\154\145\155\145\156\164\163", "\151\156\164", "\151\156\164\145\162\146\141\143\145", "\156\145\167", 
"\156\145\167\141\162\162\141\171", "\156\165\154\154", "\160\162\151\156\164\154\156", 
"\162\145\141\144\154\156", "\162\145\164\165\162\156", "\163\164\162\151\156\147", "\166\157\151\144", 
"\167\150\151\154\145", null, null, null, null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_ML_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, 1, 0, -1, -1, 
};
static final long[] jjtoToken = {
   0x203ffffffffffff1L, 
};
static final long[] jjtoSkip = {
   0x1e0000000000000eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[35];
private final int[] jjstateSet = new int[70];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public MyNewGrammarTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public MyNewGrammarTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 35; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 61;
       jjmatchedPos = -1;
       curPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 60)
       {
          jjmatchedKind = 60;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

int[] jjemptyLineNo = new int[2];
int[] jjemptyColNo = new int[2];
boolean[] jjbeenHere = new boolean[2];
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 4 :
         break;
      case 5 :
         break;
      case 6 :
         break;
      case 7 :
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      case 24 :
         break;
      case 25 :
         break;
      case 26 :
         break;
      case 27 :
         break;
      case 28 :
         break;
      case 29 :
         break;
      case 30 :
         break;
      case 31 :
         break;
      case 32 :
         break;
      case 33 :
         break;
      case 34 :
         break;
      case 35 :
         break;
      case 36 :
         break;
      case 37 :
         break;
      case 38 :
         break;
      case 39 :
         break;
      case 40 :
         break;
      case 41 :
         break;
      case 42 :
         break;
      case 43 :
         break;
      case 44 :
         break;
      case 45 :
         break;
      case 46 :
         break;
      case 47 :
         break;
      case 48 :
         break;
      case 49 :
         break;
      case 50 :
         break;
      case 51 :
         break;
      case 52 :
         break;
      case 53 :
         break;
      case 61 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() &&
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
