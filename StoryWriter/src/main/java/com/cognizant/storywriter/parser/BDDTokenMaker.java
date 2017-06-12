/* 
 * Copyright 2014 - 2017 Cognizant Technology Solutions
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cognizant.storywriter.parser;
import java.io.*;   
import javax.swing.text.Segment;   
import java.io.Reader;
import org.fife.ui.rsyntaxtextarea.*;  

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 5/24/17 4:50 PM from the specification file
 */
public class BDDTokenMaker extends AbstractJFlexCTokenMaker {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int LONG_STRING_2 = 2;
  public static final int LONG_STRING_1 = 1;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\32\1\12\1\0\1\32\1\30\22\0\1\56\1\34\1\11"+
    "\1\31\1\35\1\40\1\103\1\10\1\76\1\76\1\101\1\36\1\34"+
    "\1\26\1\23\1\41\1\16\7\21\2\3\1\50\1\37\1\52\1\100"+
    "\1\53\1\34\1\33\1\74\1\57\2\22\1\25\1\54\1\71\2\2"+
    "\1\27\1\2\1\15\2\2\1\67\2\2\1\6\1\66\1\73\1\7"+
    "\1\2\1\73\1\20\2\2\1\76\1\13\1\76\1\102\1\1\1\0"+
    "\1\55\1\22\1\60\1\65\1\24\1\46\1\62\1\42\1\47\1\27"+
    "\1\61\1\14\1\70\1\64\1\63\1\44\1\2\1\4\1\45\1\43"+
    "\1\5\1\72\1\51\1\17\2\2\1\77\1\75\1\77\1\34\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\2\2\2\4\1\5\1\3"+
    "\1\6\1\2\1\6\1\7\1\10\1\2\2\6\1\2"+
    "\1\6\3\2\2\11\1\2\1\10\5\2\1\6\1\11"+
    "\2\6\5\12\5\4\1\13\1\3\1\14\1\13\1\14"+
    "\2\4\1\0\2\4\1\0\1\13\1\3\1\13\1\2"+
    "\2\7\1\15\4\2\1\0\1\2\1\0\1\15\6\2"+
    "\1\0\4\12\1\0\4\4\1\0\2\14\1\0\1\4"+
    "\1\16\1\17\1\3\1\2\1\7\4\2\1\20\5\2"+
    "\1\21\4\12\1\22\4\4\1\14\1\2\1\7\1\2"+
    "\1\0\1\23\1\2\1\24\2\2\2\12\1\23\2\4"+
    "\1\23\1\2\1\25\2\0\3\2\2\12\2\4\11\2"+
    "\1\0\2\2\1\26\1\27\1\2\1\0\1\27\7\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[171];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\104\0\210\0\314\0\u0110\0\u0154\0\u0198\0\u01dc"+
    "\0\u0220\0\u0264\0\314\0\u02a8\0\u02ec\0\u0330\0\u0374\0\u03b8"+
    "\0\u03fc\0\u0440\0\314\0\u0484\0\314\0\u04c8\0\u050c\0\u0550"+
    "\0\u0594\0\u05d8\0\u061c\0\u0660\0\u06a4\0\u06e8\0\u072c\0\u0770"+
    "\0\u07b4\0\u07f8\0\u083c\0\314\0\u0880\0\u08c4\0\u0908\0\u094c"+
    "\0\u0990\0\u09d4\0\u0a18\0\u0a5c\0\u0aa0\0\u0ae4\0\u0b28\0\u0b6c"+
    "\0\u0bb0\0\u0bb0\0\u0bf4\0\u0c38\0\u0bb0\0\u0c7c\0\u0cc0\0\u0d04"+
    "\0\u0d48\0\u0d8c\0\u0dd0\0\u0e14\0\u0e58\0\u0e9c\0\u0ee0\0\u0f24"+
    "\0\u0f68\0\u0fac\0\u0ff0\0\u1034\0\u1078\0\u10bc\0\u1100\0\u1144"+
    "\0\u1188\0\u1188\0\u11cc\0\u1210\0\u1254\0\u1298\0\u12dc\0\u1320"+
    "\0\u1364\0\u13a8\0\u13ec\0\u1430\0\u1474\0\u14b8\0\u14fc\0\u1540"+
    "\0\u1584\0\u15c8\0\u160c\0\314\0\u1650\0\u1694\0\314\0\314"+
    "\0\314\0\u16d8\0\u171c\0\u1760\0\u17a4\0\u17e8\0\u182c\0\u1870"+
    "\0\314\0\u18b4\0\u18f8\0\u193c\0\u1980\0\u19c4\0\314\0\u1a08"+
    "\0\u1a4c\0\u1a90\0\u1ad4\0\314\0\u1b18\0\u1b5c\0\u1ba0\0\u1be4"+
    "\0\u1c28\0\u1c6c\0\u1cb0\0\u1cf4\0\u1d38\0\u1d7c\0\u1dc0\0\314"+
    "\0\u1e04\0\u1e48\0\u1e8c\0\u1ed0\0\u1f14\0\u1f58\0\u1f9c\0\u1fe0"+
    "\0\u2024\0\u0f24\0\u2068\0\u1d7c\0\u20ac\0\u20f0\0\u2134\0\u2178"+
    "\0\u1f14\0\u21bc\0\u1fe0\0\u2200\0\u2244\0\u2288\0\u22cc\0\u2310"+
    "\0\u2354\0\u2398\0\u23dc\0\u2420\0\u2464\0\u24a8\0\u24ec\0\314"+
    "\0\u2530\0\u2574\0\u25b8\0\314\0\u25fc\0\u2640\0\u2684\0\u26c8"+
    "\0\u270c\0\u2750\0\u2794";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[171];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\2\5\1\6\1\7\1\10\1\7\1\10\1\11"+
    "\1\12\1\13\1\4\2\5\1\14\2\5\1\6\1\5"+
    "\1\15\1\5\1\16\1\17\1\5\1\4\1\20\1\21"+
    "\1\22\1\23\1\4\1\24\1\25\2\26\1\27\3\5"+
    "\1\30\1\5\1\23\1\31\1\32\1\33\1\34\1\5"+
    "\1\35\1\36\6\5\1\37\2\5\1\40\1\5\1\41"+
    "\1\42\1\43\2\44\1\26\1\45\1\23\1\46\10\47"+
    "\1\50\31\47\1\51\3\47\1\52\2\47\1\53\32\47"+
    "\11\54\1\55\30\54\1\56\3\54\1\57\2\54\1\60"+
    "\32\54\105\0\7\5\4\0\7\5\1\0\2\5\1\0"+
    "\1\5\12\0\6\5\1\0\1\5\2\0\2\5\1\0"+
    "\16\5\7\0\3\61\1\6\4\61\3\0\1\61\2\62"+
    "\1\6\2\61\1\6\1\61\1\63\2\64\1\0\1\65"+
    "\1\0\1\61\1\0\1\61\1\0\1\61\4\0\6\61"+
    "\1\0\1\61\2\0\2\61\1\0\16\61\10\0\7\5"+
    "\1\11\1\12\2\0\7\5\1\0\2\5\1\0\1\5"+
    "\12\0\6\5\1\0\1\5\2\0\2\5\1\0\16\5"+
    "\10\0\3\5\1\7\1\5\1\7\1\5\1\11\1\12"+
    "\2\0\7\5\1\0\2\5\1\0\1\5\12\0\6\5"+
    "\1\0\1\5\2\0\2\5\1\0\16\5\7\0\10\66"+
    "\1\67\1\66\1\0\1\70\70\66\11\71\1\72\1\0"+
    "\1\73\70\71\3\61\1\74\4\61\3\0\1\61\2\62"+
    "\1\75\2\76\1\75\1\61\1\63\2\64\1\0\1\65"+
    "\1\0\1\61\1\0\1\61\1\0\1\61\4\0\6\61"+
    "\1\0\1\61\2\0\2\61\1\0\16\61\12\0\1\63"+
    "\12\0\1\63\2\0\1\63\63\0\7\5\4\0\3\5"+
    "\1\77\3\5\1\0\2\5\1\0\1\5\12\0\6\5"+
    "\1\0\1\5\2\0\2\5\1\0\16\5\35\0\1\23"+
    "\51\0\1\23\3\0\12\100\1\0\62\100\1\101\6\100"+
    "\32\0\1\21\23\0\1\21\26\0\2\102\1\0\4\102"+
    "\4\0\2\102\1\0\2\102\1\0\1\102\1\0\2\102"+
    "\1\0\1\102\12\0\6\102\1\0\1\102\2\0\2\102"+
    "\1\0\16\102\45\0\1\23\41\0\1\23\103\0\1\23"+
    "\4\0\7\5\4\0\7\5\1\0\2\5\1\0\1\5"+
    "\12\0\1\5\1\103\4\5\1\0\1\5\2\0\2\5"+
    "\1\0\16\5\10\0\7\5\4\0\7\5\1\0\2\5"+
    "\1\0\1\5\12\0\1\5\1\104\3\5\1\105\1\0"+
    "\1\5\2\0\2\5\1\0\16\5\10\0\7\5\4\0"+
    "\7\5\1\0\2\5\1\0\1\5\12\0\6\5\1\0"+
    "\1\106\2\0\2\5\1\0\16\5\10\0\2\107\1\0"+
    "\4\107\4\0\2\107\1\0\2\107\1\0\1\107\1\0"+
    "\2\107\1\0\1\107\12\0\6\107\1\0\1\107\1\26"+
    "\1\0\2\107\1\0\16\107\62\0\1\26\31\0\7\5"+
    "\4\0\7\5\1\0\1\110\1\5\1\0\1\5\12\0"+
    "\6\5\1\0\1\5\2\0\2\5\1\0\16\5\7\0"+
    "\4\111\2\0\4\111\1\112\11\111\1\0\5\111\1\35"+
    "\10\111\1\0\10\111\2\0\1\35\25\111\1\0\4\5"+
    "\1\113\2\5\4\0\7\5\1\0\2\5\1\0\1\5"+
    "\12\0\6\5\1\0\1\5\2\0\1\5\1\114\1\0"+
    "\16\5\10\0\7\5\4\0\7\5\1\0\2\5\1\0"+
    "\1\5\12\0\6\5\1\0\1\5\2\0\2\5\1\0"+
    "\1\5\1\115\14\5\10\0\7\5\4\0\7\5\1\0"+
    "\2\5\1\0\1\5\12\0\5\5\1\116\1\0\1\5"+
    "\2\0\2\5\1\0\16\5\10\0\7\5\4\0\7\5"+
    "\1\0\2\5\1\0\1\5\12\0\1\117\5\5\1\0"+
    "\1\5\2\0\2\5\1\0\16\5\10\0\7\5\4\0"+
    "\7\5\1\0\2\5\1\0\1\5\12\0\6\5\1\0"+
    "\1\5\2\0\2\5\1\0\5\5\1\120\10\5\104\0"+
    "\1\23\106\0\2\23\105\0\1\23\10\47\1\0\73\47"+
    "\10\0\1\121\73\0\10\47\1\0\32\47\1\122\50\47"+
    "\1\0\32\47\1\123\3\47\1\124\44\47\1\0\40\47"+
    "\1\125\32\47\11\54\1\0\72\54\11\0\1\126\72\0"+
    "\11\54\1\0\31\54\1\127\51\54\1\0\31\54\1\130"+
    "\3\54\1\131\45\54\1\0\37\54\1\132\32\54\10\61"+
    "\3\0\10\61\1\0\2\61\1\0\1\61\1\0\1\61"+
    "\1\0\1\61\1\0\1\61\4\0\6\61\1\0\1\61"+
    "\2\0\2\61\1\0\16\61\12\0\1\63\12\0\1\63"+
    "\2\0\1\63\2\0\2\133\1\0\1\134\54\0\3\61"+
    "\1\135\4\61\3\0\3\61\1\135\2\61\1\135\1\61"+
    "\1\0\2\61\1\136\1\61\1\0\1\61\1\0\1\61"+
    "\1\0\1\61\1\136\3\0\6\61\1\0\1\61\2\0"+
    "\2\61\1\0\16\61\7\0\10\66\1\137\1\66\1\0"+
    "\1\70\70\66\10\0\1\140\73\0\12\66\1\0\71\66"+
    "\11\71\1\137\1\0\1\73\70\71\11\0\1\141\72\0"+
    "\12\71\1\0\71\71\3\61\1\74\4\61\3\0\3\61"+
    "\1\74\2\61\1\74\1\61\1\63\2\64\1\0\1\65"+
    "\1\0\1\61\1\0\1\61\1\0\1\61\4\0\6\61"+
    "\1\0\1\61\2\0\2\61\1\0\16\61\7\0\3\61"+
    "\1\74\4\61\3\0\1\61\2\62\1\75\2\61\1\75"+
    "\1\61\1\63\2\64\1\0\1\65\1\0\1\61\1\0"+
    "\1\61\1\0\1\61\4\0\6\61\1\0\1\61\2\0"+
    "\2\61\1\0\16\61\7\0\3\61\1\142\4\61\3\0"+
    "\3\61\1\142\2\61\2\142\1\0\2\142\1\0\1\61"+
    "\1\0\1\61\1\0\1\61\1\0\1\61\4\0\4\61"+
    "\1\142\1\61\1\0\1\61\2\0\2\142\1\0\2\142"+
    "\4\61\1\142\6\61\1\142\10\0\7\5\4\0\7\5"+
    "\1\0\2\5\1\0\1\5\12\0\6\5\1\0\1\5"+
    "\2\0\1\5\1\143\1\0\16\5\7\0\12\100\1\0"+
    "\72\100\2\144\1\100\4\144\2\100\1\0\1\100\2\144"+
    "\1\100\2\144\1\100\1\144\1\100\2\144\1\100\1\144"+
    "\12\100\6\144\1\100\1\144\2\100\2\144\1\100\16\144"+
    "\7\100\1\0\7\102\4\0\7\102\1\0\2\102\1\0"+
    "\1\102\12\0\6\102\1\0\1\102\2\0\2\102\1\0"+
    "\16\102\10\0\7\5\4\0\7\5\1\0\2\5\1\0"+
    "\1\5\12\0\1\5\1\145\4\5\1\0\1\5\2\0"+
    "\2\5\1\0\16\5\10\0\7\5\4\0\7\5\1\0"+
    "\2\5\1\0\1\5\12\0\2\5\1\146\3\5\1\0"+
    "\1\5\2\0\2\5\1\0\16\5\10\0\7\5\4\0"+
    "\1\147\6\5\1\0\2\5\1\0\1\5\12\0\6\5"+
    "\1\0\1\5\2\0\2\5\1\0\16\5\10\0\7\5"+
    "\4\0\7\5\1\0\2\5\1\0\1\5\12\0\6\5"+
    "\1\0\1\150\2\0\2\5\1\0\16\5\10\0\7\107"+
    "\4\0\7\107\1\0\2\107\1\0\1\107\12\0\6\107"+
    "\1\0\1\107\1\0\1\151\2\107\1\0\16\107\10\0"+
    "\7\5\4\0\7\5\1\0\2\5\1\0\1\5\12\0"+
    "\6\5\1\0\1\5\2\0\1\5\1\152\1\0\16\5"+
    "\7\0\4\111\2\0\4\111\1\112\11\111\1\0\16\111"+
    "\1\0\10\111\2\0\26\111\1\0\7\5\4\0\7\5"+
    "\1\0\2\5\1\0\1\5\12\0\1\5\1\153\4\5"+
    "\1\0\1\5\2\0\2\5\1\0\16\5\10\0\7\5"+
    "\4\0\7\5\1\0\2\5\1\0\1\5\12\0\6\5"+
    "\1\0\1\5\2\0\2\5\1\0\1\5\1\154\14\5"+
    "\10\0\7\5\4\0\7\5\1\0\1\155\1\5\1\0"+
    "\1\5\12\0\6\5\1\0\1\5\2\0\2\5\1\0"+
    "\16\5\10\0\7\5\4\0\7\5\1\0\2\5\1\0"+
    "\1\5\12\0\6\5\1\0\1\5\2\0\2\5\1\0"+
    "\13\5\1\117\2\5\10\0\7\5\4\0\7\5\1\0"+
    "\1\156\1\5\1\0\1\5\12\0\6\5\1\0\1\5"+
    "\2\0\2\5\1\0\16\5\10\0\7\5\4\0\7\5"+
    "\1\0\2\5\1\0\1\5\12\0\6\5\1\0\1\5"+
    "\2\0\2\5\1\0\6\5\1\153\7\5\17\0\1\157"+
    "\73\0\10\47\1\0\32\47\1\160\50\47\1\0\33\47"+
    "\1\161\47\47\1\0\3\47\1\162\77\47\1\0\40\47"+
    "\1\163\32\47\11\0\1\164\72\0\11\54\1\0\31\54"+
    "\1\165\51\54\1\0\32\54\1\166\50\54\1\0\2\54"+
    "\1\167\100\54\1\0\37\54\1\170\32\54\3\0\1\171"+
    "\12\0\1\171\2\0\1\171\4\0\1\136\7\0\1\136"+
    "\45\0\3\61\1\135\4\61\3\0\3\61\1\135\2\61"+
    "\1\135\1\61\1\0\2\61\1\0\1\65\1\0\1\61"+
    "\1\0\1\61\1\0\1\61\4\0\6\61\1\0\1\61"+
    "\2\0\2\61\1\0\16\61\12\0\1\171\12\0\1\171"+
    "\2\0\1\171\62\0\3\61\1\142\4\61\3\0\1\61"+
    "\2\62\1\142\2\61\2\142\1\0\2\142\1\0\1\61"+
    "\1\0\1\61\1\0\1\61\1\0\1\61\4\0\4\61"+
    "\1\142\1\61\1\0\1\61\2\0\2\142\1\0\2\142"+
    "\4\61\1\142\6\61\1\142\10\0\7\5\4\0\7\5"+
    "\1\0\2\5\1\0\1\5\12\0\6\5\1\0\1\5"+
    "\2\0\2\5\1\0\11\5\1\172\4\5\7\0\1\100"+
    "\7\144\2\100\1\0\1\100\7\144\1\100\2\144\1\100"+
    "\1\144\2\100\1\173\7\100\6\144\1\100\1\144\2\100"+
    "\2\144\1\173\16\144\7\100\1\0\7\5\4\0\7\5"+
    "\1\0\2\5\1\0\1\5\12\0\2\5\1\174\3\5"+
    "\1\0\1\5\2\0\2\5\1\0\16\5\10\0\7\5"+
    "\4\0\7\5\1\0\2\5\1\0\1\5\12\0\6\5"+
    "\1\175\1\5\2\0\2\5\1\0\16\5\10\0\7\5"+
    "\4\0\7\5\1\0\1\146\1\5\1\0\1\5\12\0"+
    "\6\5\1\0\1\5\2\0\2\5\1\0\16\5\10\0"+
    "\7\5\4\0\7\5\1\176\2\5\1\0\1\5\12\0"+
    "\6\5\1\0\1\5\2\0\2\5\1\0\16\5\10\0"+
    "\7\5\4\0\7\5\1\0\2\5\1\0\1\5\12\0"+
    "\1\5\1\177\4\5\1\0\1\5\2\0\2\5\1\0"+
    "\16\5\10\0\7\5\4\0\7\5\1\0\2\5\1\0"+
    "\1\5\2\0\1\200\7\0\6\5\1\0\1\5\2\0"+
    "\2\5\1\200\16\5\10\0\7\5\4\0\7\5\1\0"+
    "\2\5\1\0\1\5\12\0\6\5\1\0\1\5\2\0"+
    "\2\5\1\0\2\5\1\201\13\5\10\0\7\5\4\0"+
    "\7\5\1\0\2\5\1\0\1\5\12\0\6\5\1\0"+
    "\1\5\2\0\2\5\1\0\5\5\1\202\10\5\10\0"+
    "\7\5\4\0\7\5\1\0\2\5\1\0\1\5\12\0"+
    "\6\5\1\0\1\5\2\0\2\5\1\0\5\5\1\153"+
    "\10\5\7\0\10\47\1\0\33\47\1\203\47\47\1\0"+
    "\37\47\1\204\43\47\1\0\13\47\1\161\67\47\1\0"+
    "\12\47\1\205\60\47\11\54\1\0\32\54\1\206\50\54"+
    "\1\0\36\54\1\207\44\54\1\0\12\54\1\166\70\54"+
    "\1\0\11\54\1\210\60\54\3\0\1\171\12\0\1\171"+
    "\2\0\1\171\5\0\1\134\55\0\7\5\4\0\7\5"+
    "\1\0\2\5\1\0\1\5\12\0\2\5\1\211\3\5"+
    "\1\0\1\5\2\0\2\5\1\0\16\5\7\0\12\100"+
    "\1\0\17\100\1\173\23\100\1\173\16\100\1\212\6\100"+
    "\1\0\7\5\4\0\7\5\1\0\2\5\1\0\1\5"+
    "\12\0\3\5\1\146\2\5\1\175\1\5\2\0\2\5"+
    "\1\0\16\5\50\0\1\213\43\0\1\214\6\176\1\214"+
    "\3\0\7\176\1\214\2\176\1\214\1\176\1\0\1\214"+
    "\1\0\2\214\1\176\3\214\7\176\1\214\1\176\2\0"+
    "\2\176\1\0\16\176\1\0\1\214\1\0\2\214\1\0"+
    "\1\214\1\0\4\5\1\215\2\5\4\0\7\5\1\0"+
    "\2\5\1\0\1\5\12\0\6\5\1\0\1\5\2\0"+
    "\2\5\1\0\16\5\10\0\7\5\4\0\7\5\1\0"+
    "\2\5\1\0\1\5\12\0\6\5\1\0\1\5\2\0"+
    "\2\5\1\0\3\5\1\216\12\5\10\0\7\5\4\0"+
    "\7\5\1\0\2\5\1\0\1\5\12\0\6\5\1\0"+
    "\1\5\2\0\1\5\1\217\1\0\16\5\7\0\10\47"+
    "\1\0\34\47\1\161\2\47\1\204\43\47\1\0\30\47"+
    "\1\220\43\47\1\221\6\205\1\214\3\47\7\205\1\221"+
    "\2\205\1\221\1\205\1\47\1\221\1\47\2\221\1\205"+
    "\3\221\7\205\1\221\1\205\2\47\2\205\1\47\16\205"+
    "\1\47\1\221\1\47\2\221\1\47\1\221\11\54\1\0"+
    "\33\54\1\166\2\54\1\207\44\54\1\0\27\54\1\222"+
    "\43\54\1\223\6\210\1\223\1\0\2\54\7\210\1\223"+
    "\2\210\1\223\1\210\1\54\1\223\1\54\2\223\1\210"+
    "\3\223\7\210\1\223\1\210\2\54\2\210\1\54\16\210"+
    "\1\54\1\223\1\54\2\223\1\54\1\223\1\0\7\5"+
    "\4\0\1\224\6\5\1\0\2\5\1\0\1\5\12\0"+
    "\6\5\1\0\1\5\2\0\2\5\1\0\16\5\50\0"+
    "\1\176\43\0\3\5\1\225\3\5\4\0\7\5\1\0"+
    "\2\5\1\0\1\5\12\0\6\5\1\0\1\5\2\0"+
    "\2\5\1\0\16\5\10\0\3\5\1\226\3\5\4\0"+
    "\7\5\1\0\2\5\1\0\1\5\12\0\6\5\1\0"+
    "\1\5\2\0\2\5\1\0\16\5\10\0\3\5\1\227"+
    "\3\5\4\0\7\5\1\0\2\5\1\0\1\5\12\0"+
    "\6\5\1\0\1\5\2\0\2\5\1\0\16\5\7\0"+
    "\10\47\1\0\30\47\1\205\42\47\11\54\1\0\27\54"+
    "\1\210\42\54\1\0\7\5\4\0\7\5\1\0\1\230"+
    "\1\5\1\0\1\5\12\0\6\5\1\0\1\5\2\0"+
    "\2\5\1\0\16\5\10\0\7\5\4\0\7\5\1\0"+
    "\1\231\1\5\1\0\1\5\12\0\6\5\1\0\1\5"+
    "\2\0\2\5\1\0\16\5\10\0\7\5\4\0\7\5"+
    "\1\0\2\5\1\0\1\5\12\0\6\5\1\0\1\5"+
    "\2\0\2\5\1\0\4\5\1\232\11\5\10\0\7\5"+
    "\4\0\7\5\1\0\2\5\1\0\1\5\12\0\5\5"+
    "\1\233\1\0\1\5\2\0\2\5\1\0\16\5\10\0"+
    "\7\5\4\0\7\5\1\0\2\5\1\0\1\5\12\0"+
    "\3\5\1\234\2\5\1\0\1\5\2\0\2\5\1\0"+
    "\16\5\10\0\7\5\4\0\7\5\1\0\2\5\1\0"+
    "\1\5\12\0\6\5\1\235\1\5\2\0\2\5\1\0"+
    "\16\5\10\0\4\5\1\236\2\5\4\0\7\5\1\0"+
    "\2\5\1\0\1\5\12\0\6\5\1\0\1\5\2\0"+
    "\2\5\1\0\16\5\10\0\7\5\4\0\7\5\1\0"+
    "\2\5\1\0\1\5\12\0\6\5\1\0\1\5\2\0"+
    "\2\5\1\0\4\5\1\237\11\5\10\0\7\5\4\0"+
    "\7\5\1\0\2\5\1\0\1\5\12\0\6\5\1\240"+
    "\1\5\2\0\2\5\1\0\16\5\65\0\1\241\26\0"+
    "\7\5\4\0\7\5\1\0\2\5\1\0\1\5\12\0"+
    "\6\5\1\0\1\5\2\0\2\5\1\0\5\5\1\242"+
    "\10\5\10\0\7\5\4\0\7\5\1\0\2\5\1\0"+
    "\1\5\12\0\6\5\1\240\1\5\2\0\2\5\1\243"+
    "\16\5\7\0\12\241\1\244\71\241\1\0\7\5\4\0"+
    "\7\5\1\0\2\5\1\0\1\5\12\0\6\5\1\0"+
    "\1\5\2\0\2\5\1\0\6\5\1\234\7\5\76\0"+
    "\1\245\21\0\1\246\141\0\1\247\54\0\1\250\136\0"+
    "\1\251\120\0\1\252\43\0\1\253\127\0\1\240\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10200];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\6\1\1\11\7\1\1\11\1\1\1\11"+
    "\16\1\1\11\23\1\1\0\2\1\1\0\13\1\1\0"+
    "\1\1\1\0\7\1\1\0\4\1\1\0\4\1\1\0"+
    "\1\11\1\1\1\0\3\11\7\1\1\11\5\1\1\11"+
    "\4\1\1\11\10\1\1\0\2\1\1\11\12\1\2\0"+
    "\20\1\1\0\2\1\1\11\2\1\1\0\1\11\7\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[171];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */

   /**   
    * Constructor.  This must be here because JFlex does not generate a   
    * no-parameter constructor.   
    */   
   public BDDTokenMaker() {   
   }   


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 * @param link Whether this token is a hyperlink.
	 */
	private void addToken(int tokenType, boolean link) {
		int so = zzStartRead + offsetShift;
		super.addToken(zzBuffer, zzStartRead,zzMarkedPos-1, tokenType, so, link);
		zzStartRead = zzMarkedPos;
	}

	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 * @param link Whether this token is a hyperlink.
	 */
	private void addToken(int tokenType) {
		addToken(tokenType,false);
	}

	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 * @see #addHyperlinkToken(int, int, int)
	 */
	private void addToken(int start, int end, int tokenType) {
		int so = start + offsetShift;
		addToken(zzBuffer, start,end, tokenType, so, false);
	}

	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 * @see #addToken(int, int, int)
	 */
	private void addHyperlinkToken(int start, int end, int tokenType) {
		int so = start + offsetShift;
		addToken(zzBuffer, start,end, tokenType, so, true);
	}

	/**
	 * Always returns <code>Token.NULL</code>, as there are no multiline
	 * tokens in properties files.
	 *
	 * @param text The line of tokens to examine.
	 * @param initialTokenType The token type to start with (i.e., the value
	 *        of <code>getLastTokenTypeOnLine</code> for the line before
	 *        <code>text</code>).
	 * @return <code>Token.NULL</code>.
	 */
	public int getLastTokenTypeOnLine(Segment text, int initialTokenType) {
		return Token.NULL;
	}

	/**
	 * Returns the text to place at the beginning and end of a
	 * line to "comment" it in a this programming language.
	 *
	 * @return <code>null</code>, as there are no comments in plain text.
	 */
	@Override
	public String[] getLineCommentStartAndEnd(int languageIndex) {
		return null;
	}

	/**
	 * Always returns <tt>false</tt>, as you never want "mark occurrences"
	 * working in plain text files.
	 *
	 * @param type The token type.
	 * @return Whether tokens of this type should have "mark occurrences"
	 *         enabled.
	 */
	public boolean getMarkOccurrencesOfTokenType(int type) {
		return false;
	}


	/**
	 * Returns the first token in the linked list of tokens generated
	 * from <code>text</code>.  This method must be implemented by
	 * subclasses so they can correctly implement syntax highlighting.
	 *
	 * @param text The text from which to get tokens.
	 * @param initialTokenType The token type we should start with.
	 * @param startOffset The offset into the document at which
	 *        <code>text</code> starts.
	 * @return The first <code>Token</code> in a linked list representing
	 *         the syntax highlighted text.
	 */
	public Token getTokenList(Segment text, int initialTokenType, int startOffset) {

		resetTokenList();
		this.offsetShift = -text.offset + startOffset;

		// Start off in the proper state.
		s = text;
		try {
			yyreset(zzReader);
			yybegin(YYINITIAL);
			return yylex();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return new TokenImpl();
		}

	}    

	/**
	 * Refills the input buffer.
	 *
	 * @return      <code>true</code> if EOF was reached, otherwise
	 *              <code>false</code>.
	 * @exception   IOException  if any I/O-Error occurs.
	 */
	private boolean zzRefill() {
		return zzCurrentPos>=s.offset+s.count;
	}

	/**
	 * Resets the scanner to read from a new input stream.
	 * Does not close the old reader.
	 *
	 * All internal variables are reset, the old input stream 
	 * <b>cannot</b> be reused (internal buffer is discarded and lost).
	 * Lexical state is set to <tt>YY_INITIAL</tt>.
	 *
	 * @param reader   the new input stream 
	 */
	public final void yyreset(Reader reader) {
		// 's' has been updated.
		zzBuffer = s.array;
		/*
		 * We replaced the line below with the two below it because zzRefill
		 * no longer "refills" the buffer (since the way we do it, it's always
		 * "full" the first time through, since it points to the segment's
		 * array).  So, we assign zzEndRead here.
		 */
		//zzStartRead = zzEndRead = s.offset;
		zzStartRead = s.offset;
		zzEndRead = zzStartRead + s.count - 1;
		zzCurrentPos = zzMarkedPos = zzPushbackPos = s.offset;
		zzLexicalState = YYINITIAL;
		zzReader = reader;
		zzAtBOL  = true;
		zzAtEOF  = false;
	}




  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public BDDTokenMaker(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public BDDTokenMaker(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill2() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset2(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public org.fife.ui.rsyntaxtextarea.Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { addNullToken(); return firstToken;
          }
        case 24: break;
        case 10: 
          { addToken(Token.LITERAL_CHAR);
          }
        case 25: break;
        case 8: 
          { addToken(Token.WHITESPACE);
          }
        case 26: break;
        case 12: 
          { addToken(Token.LITERAL_NUMBER_FLOAT);
          }
        case 27: break;
        case 22: 
          { addHyperlinkToken(zzStartRead,zzMarkedPos - 2,Token.RESERVED_WORD);
 									addToken(zzMarkedPos - 1,zzMarkedPos - 1,Token.OPERATOR);
          }
        case 28: break;
        case 20: 
          { addToken(Token.RESERVED_WORD);
          }
        case 29: break;
        case 9: 
          { addToken(Token.SEPARATOR);
          }
        case 30: break;
        case 14: 
          { yybegin(LONG_STRING_1); addToken(Token.LITERAL_CHAR);
          }
        case 31: break;
        case 2: 
          { addToken(Token.IDENTIFIER);
          }
        case 32: break;
        case 1: 
          { addToken(Token.ERROR_IDENTIFIER);
          }
        case 33: break;
        case 16: 
          { addToken(Token.DATA_TYPE);
          }
        case 34: break;
        case 13: 
          { addToken(Token.ANNOTATION);
          }
        case 35: break;
        case 23: 
          { int len="Feature".length(); 
                                    addHyperlinkToken(zzStartRead,zzStartRead+len-1,Token.FUNCTION);
									addToken(zzStartRead+len,zzStartRead+len,Token.OPERATOR);
						 			addToken(zzStartRead+len+1,zzMarkedPos - 1,Token.LITERAL_BACKQUOTE);
									//out.println("Feature end:"+zzMarkedPos);
          }
        case 36: break;
        case 4: 
          { addToken(Token.LITERAL_STRING_DOUBLE_QUOTE);
          }
        case 37: break;
        case 21: 
          { //addToken(zzStartRead,zzStartRead,Token.OPERATOR);
									//addToken(zzStartRead+1,zzMarkedPos - 2,Token.DATA_TYPE); 
									//addToken(zzMarkedPos -1,zzMarkedPos -1,Token.OPERATOR);
          }
        case 38: break;
        case 19: 
          { addToken(Token.IDENTIFIER, true);
          }
        case 39: break;
        case 7: 
          { addToken(Token.COMMENT_EOL);
          }
        case 40: break;
        case 11: 
          { addToken(Token.ERROR_NUMBER_FORMAT);
          }
        case 41: break;
        case 3: 
          { addToken(Token.LITERAL_NUMBER_DECIMAL_INT);
          }
        case 42: break;
        case 6: 
          { addToken(Token.OPERATOR);
          }
        case 43: break;
        case 18: 
          { yybegin(YYINITIAL); addToken(Token.LITERAL_STRING_DOUBLE_QUOTE);
          }
        case 44: break;
        case 15: 
          { yybegin(LONG_STRING_2); addToken(Token.LITERAL_STRING_DOUBLE_QUOTE);
          }
        case 45: break;
        case 17: 
          { yybegin(YYINITIAL); addToken(Token.LITERAL_CHAR);
          }
        case 46: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case YYINITIAL: {
              addNullToken(); return firstToken;
            }
            case 172: break;
            case LONG_STRING_2: {
              if (firstToken==null) {
                                    	addToken(Token.LITERAL_STRING_DOUBLE_QUOTE); 
                                    }
                                    return firstToken;
            }
            case 173: break;
            case LONG_STRING_1: {
              if (firstToken==null) {
										addToken(Token.LITERAL_CHAR); 
                                    }
                                    return firstToken;
            }
            case 174: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
