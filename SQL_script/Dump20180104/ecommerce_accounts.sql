-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ecommerce
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accounts` (
  `Email` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `Password` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Role` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `FullName` varchar(200) CHARACTER SET utf8 NOT NULL,
  `Address` varchar(200) CHARACTER SET utf8 NOT NULL,
  `Phone` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `BillingAddress` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `ShipAddress` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `DateEntered` datetime NOT NULL,
  `Image` longblob,
  `IsActive` int(11) NOT NULL DEFAULT '1' COMMENT 'IsActive = 0 => Not Active\nIsActive = 1 => Active\n',
  PRIMARY KEY (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES ('khanhhuy215@gmail.com','123456','ROLE_ADMIN','Phan Nhật Khánh Huy','125 KP 3 Mai Chí Thọ - Phường An Phú - Quận 2 - TP Hồ Chí Minh','0932082309','125 KP 3 Mai Chí Thọ - Phường An Phú - Quận 2 - TP Hồ Chí Minh','125 KP 3 Mai Chí Thọ - Phường An Phú - Quận 2 - TP Hồ Chí Minh','2017-11-16 21:07:21','�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\�\0\0\0\�\0\0\0��4�\0\0�PLTE���=<:...BBB@@@===???AAA;;;999777\"\"\":::444000khc}ys<<<***432���666(((FEB���&&&spk222���`^Y$$$XVR��{���,,,OMJ\'\'&###333���IIIcccaRJ{xr�{m���.+)UICɢ�;40��u�qe䷟֬������yG>9{iZp^TŘ��k\\�붛�{jީ�곗mXMkhd�yTF>Ѡ��sc￥KJHSQOyaU곘\���诓媍\��ۓr㤆�ԁ]��rߙy\�pI\�e<\�jB\�|Wևc굚\�vP؍jFFF\�xR׊g诒ߜ|\�nG᠀\�iA箑Յa;::婋䥇\�sM鱕㤅檍�����cK4%츝�T5\�wV���\�iBj?-C0%�[B���笏��v\�\�\��\�ΏkZrG0�X9_7$C,=(t[=dL2\�\�\����\�ķܕt���xqlU9b9%ؽ��{\\ؕx���hR6pW:`I1��㲝\�nH缪\�\�\�YC-ޠ��\�\�R;-x^>�\�\�\�oJ���zaA������\�\�ն_;�eC�\�\����������\����н�\�\��˷�����Ư�\�\�ſ������t�\�߲���Ȳ᪒�\�ǿ�i��p�©䦉͙�����{aڐo��}׉f\�mE������\�\�\����\�\�\�\�\�\�\�\�\�\�\�\�ZZY���fff���CBB���[[[OOOa`_LLLYYY���\�\�\�VVVbbb������___RRRzzzQQQ���\�\�\�dddSSSTTT^^^������\�DJ�in�\�\����\�8>�\�\�qqq�\�\�\�PV\�]b߅������\� \�\0\0\Z[IDATx\�\�	^�:�q\�$�$!}I*��\��V\���\�\�,�\�\�B���\��Ls���?B�Nb�q�\n���~\��\�\�:Q\��AIi>\Z�j\�ȃ�Ø\���1��\�)\�ŕ�3(E*,\�\'�6а\"p)I������\�ac\�&\�#\�T���@aA{\��\�Tr\��1��\��\��r�/\��Q&ม\�\�\�/\�%=�3^J�Bd��J$�5�O\�\�\�\�Q^L`/Th	�a\�\�\�\�{�\�f\n�B�j6Ol29;=LW\0F�#Lb`?\�RUk�yjg��!\�\�)�\0@\�\n݊ja�k\�(\��\�5t�Z�\�}�:\�(�\�\� ��\03���\�ߘ>�L0�.�`�߬.��\ZJ��N)\�1.-\���\�\�l�	�Mp\�W���<�O��~՗`ͱD�<\�\�1�пt�K0\�	l�T�_���.>=\���\�\'<�\�R��\\\�Kr\��a\�?\�\�\�\�t2\�Ylq۶KdwaV2��֦îo�O�\�-\�\\\�vTBW���r\�~\��X�\�a\�\�R���%\�l�<\�\n��\�P	����f\"Dl�\�e,?O�Z /���D\�hna�BM�\n��GeJ�\�\���{91wJ�\n9�j)P\�eX P�>\�w\�L?;Ǚ�D\�#\�P5�4\0@1��\"��(�\�%��켣*\"�8)ԩUEl�K}J����\nE-�f\�ϥ�T�\�)\�v`J��wR�\�p\naX�\r�\�|\�.9>\�\�_\�a�[C�����\r\0�7�G\�h˜�g֜�ñ[-ԨT�堂:�̣��zi��w\n\Z�\���;q>:]�\�hbj�El�U_ߒ��K	hJ.:�g^�ڨ�\�/W^��\��\n@�?D\�o\"3>�\0�6\�$\�an\Z��أK �\��]_^@ӄ�\0����)�і��H�s�\�>	�\���:��@3�l\�ǰ2H�c��+l�\�]\��\�d\�\��(\�ܣ�MH��ٱDw	��9�l�\�\�\�9\�:\�,p\�C��:�(Ֆ0�ț���>\'�\�]�Z��C�+\�fcTD\�\�*\n\"ğ�b�_~\�\�\�\�\�K\��\'Wbr\�=F�,��\�\�:\�w\�\�\���M��#�B\�wڕn\��s��)B(l�Q��\�2&���Y�\���\��il	S�\�i(�D|Jֈ\�5w�Y!N�N�8\"�\�bk�\�bEZ\�\��9k[�y�/�\�\��\�c�?==\��s�\�e\�\�1Aj�d�\�+n\��\��1w\�<l	\�]�;I�o��-\�\��\�\�!\�Z�Ѣ��\"7�lZx1\�/w����\�\Z\�k��\��孞�\�C|\�u�\�\�Z+�gg��z�\�?��XCzꚈm\�@\�\�\��T�\����m3�\�\�\�1oz1��\��y\�\�e\�\�t��x�X#��..�!�\�\��y�\��z\�R\��dǾ\�=�\�X#�\�\�\�mFk�\�!\�\�ۇ��Tv\�uW}ƛ���w׶�#t���3>�\�\�\�\�\�\Z\�uאol��:?�\�+�\Z@��.��\�K\�\��\���x�J��\0[�tmp*����u��m��)\�{�\�\�\�D\�T�f\�9�U��:o��\\\�\�EYGC������V9T\�=v{B��)�\�ٽ�]n\�П7q(\�꾨\\��\�!�\���v��z�oP\�Ez5\�t������� t��8N63��\"f�e��a\Z��	\�,\�\�7�\�vQmx���.\'ڥW�j��@�뻒��k�\�\��%1�\�\�\�X� ��ί��l1gve5�zGi���`�\�>�b*\�j�S\�(W�]T^BC\�5�u�����ӵ���ʻ\���;\�\��+%�j��M�γr�\�\�䂥Wc�\�Ju\�\�\�k�&\�ש^Ws�erY~\Z6\�L�6ײv�����	\�9���\�+\�.�М˷�]UEM�\�\�\�\��ܢk%\�B�:�\�\�]h\�e������+�\�]\�`9F]/�\�|�\�\�3芺��9�6����K�\�\�4�\���)�\�9\�=�w�\�\�\�\�j��Ă�$;�0���\�\r��2�u\�\�L\���d�;+m,�(N\�\�\�\�\0E�-���{\��D�\�\rv_��\�A-��MP2�`�AV\�!CE)GH�����\�y\�U\�\���\�\'����ᄵ�e���,�B�����`\�hm0}�\��N���\�[���9	v{]�K�\�0\Zm����4�G�A��W]Ϋ\���|�4\�%�\nF8Kx/zu��\���m�2jQO�<2N0h2�\�FV̰_����l\��o+\�Z�^��\�*U\\m!����,�1\�!#\"��\n[j�\'\��UZ�Lp�\�x\�\���\�\�d15\�i8艈��X�\�\�R��ajb\�k\�L;��\�6\�~�|m�W*	%��R��R Nm|�\��z!>|!\�x%31	��|��\�q%\�I��\�\�:\�Wm��`3(����F\��j\�Z��U��ƌ^^G�[np��(MQJ�|Z�\\\�\0�0���ל�\0�i�Z��\0c+��\�y!�\�h!%�\'4G\�$�\�Ƽ`\�\�ʽ6(�$m�u^,ϧ�\�/)`�!9�Y)X$�C֤�j�i�\�\�\�\�$I\�T�\�\0_�\�強i\�ya\�\�QFlM�)E`����jU!����\���\�G,T��z킰�/_|��\�\�r^2!�ln\�\�Dw\�ٻo��<�\�pס#�y2���\�.Q\��\�4\��XסCط}�\�O\�i�ř\�q�\�\���h.�\�0\�\�\�I\�2�\�N�Y\�)bX`��\�\�<\�c>�\�c\�!Ǐ?a�\�I0JZ!r�T��B����O���8\�`�\��\"\Z<YyzI�;\�N�Yuɒ�\�i\�\�\�Y��#?�ش8\"\r\�\�y��Ba\�\�c˭�s\�(�ϲ��\��3aH�\'X�\��\�{0��^\r\�FUΛ�W�9\����(��QO\�^~�\�\r��lӉMu�1�I���\�\�k�\r���v�M_@���zL\�\�\�\�u�\�\�L\�Ii�=&\�鳋�?\�l\�\�\�c�ȞU2AZ�C3�\��\�kK\�q��XA��l#�\�̱\�\�V�\�~�3&\�\"%я�6~\�*4��/\�B��\����|/\0Xb\nl�\�K# s��_��\���\�p\�×_\�\�\�:�\�e\�.\�eRg%.�|��뢵�\�\�\�װ,\r��:G\0B�ʽ\�Ҧ�B�k0�fPĹ\�x�R�i�|�%fq�p��㍗HI�\�x\�s^~\�٭W\� �ה\�Ӛ5\�\�������� A\��mJ�˙$^�r\�D\�~\�\�w\�}�\�ig��\�\�g\"�\�\��\�\�+-�\�e�\�\�\0!]���� (�Ԃ\��\��/D�?܃nz\��h���\�9j{�\n2!%�j!L��|@���ě\���\0q\n�C u�\�\�\�=6G�\"�9%�>ytr�\�s�!cr\�`��?�`�b\�]ɚ\r�t\��`>�Ci6Bd\�AD\�pt\��\���9���X6*\�\0�كA���c*z!\���2�^7�����\���\�1�\�I�qJ�\�Oxɲ�R�\�<\�n��FCî^,�` \Z�\�e�ȷൄ�\�6���\�9$}\�M�-3\�-<`=�*R:��\n\"/�\�\�_\�\�\�<���N[H\�U\��^x}��(\n�.�a^\n��l�L�,\��o\�\�4)b~\�W�H\Z\�,�\���\�k\�u\�C\�2�������~ðo�G�(�4\�&�`�u�\�\�r�h�}3n�\�+pѣ0đ#�v�IK]\�t��\\��v^�1�b�\rO\��1�\�n�f�f\� .\�t����\�z;\��Ն\�wձ��p��`�\r�o�C]\�zǫ�r�͸\�~\�ę\�v\0�\�WC\��\�\�\� R\�k����͜�g�6�c�\'l�Ko+.�-\�^\�/ë�:��\�[\�>H��(�Z��^��O�|\�#�\nz\�D��\�F�嵂ya��-��V|\�>u��\�.\�Nǫ���������\�Pܷ8U\�X\\��^���^喍\\h\�/�yy\�\�\0\"��k�9\�]\�X�Ngѫ\�\�	�f%KB��!V�8�-�\�R\�y8\�rZ&�_�� -~\�e\�+\�\�\�0�o��\0H\�o\"D�\�Ѱ\��\"\��\�z��\r�b\�K\'\Z6e��00�\�5����YfV\�\'m\��\�%\�<\0)�^2^zJ/D\�O�c\�\�\�:\���^j�\�\"�T\0\�\�{\�/�\��\�0	��:�\�\�4�i��\�\�\�$饀�\�\�zռ�0�\�\�\�A/�!�F\��|�\�G�\�\�h.�r,\�:>�\�[�\'لH��|\�^�x�m:Ȁ�c�\�\�TGr�^�&j\�\n���O\0!ZX$d\�!Wg���\�_\�\�(!�h���`�\nkW\�K��\�\�\�/)o�iߤ\Z�R�U\��a1\��4\�\"�2�>�\�Uٯ]\0:!!b���\�M0]	�\�J\��b-\�t(D��W\nO�D\��\�\�zmI� N�;��\�TK�ݵ�t:(I��\�\��\�BT��>\0�䈀B]��!#mm\�т\�\�\��/<�V�\\� \\�\�\���\�\�\�	CD\�\�\�S	\"\0ݼ	�\���M3���\� ,\�\�T\�\�oGQL0�B\��\�\���r\�^ؔ#jy<�\"부C/@�:\�\�j��2\�\��\�-\�&x\�\�`�i�\�\�@\�i���R}�\0\�}\";\�oڴ~\�:\�\�1\�Q\n�\�F4�\��\�\�\�1\�*����\�W�E��)5f<Y\�\�Z	�*IA\�m��z;8q\\(&]_Ӌ�\�0L\�\�\�\�w V�l\�cV�@,�;��\��ct{R\�\�°{L��b��f]Χ��hADI\�\"��A��\�\�\�Xޗ�x\�֬+��hap�Ȅ�\�lVFTQ&DU��\�\�F�k�\�\�QfDYF�\�aCE\�\�k��e�!��l�\�f\�\�a��(����\�U\�\r��w\��\�\��\Z\�\�j\�\\��U\���%\�O�\�Om�	\�uWJ\�W\�\�:�\��j�*|R4\�/�4�p�\�P-z!�\�0�aJE5HJ\�\�R\�(t�)�\�\"Q44\0\�hF��\�^#S�(t\�+\�\\��Uw���\�Q4��Ud@�\���^gV\�\0O\�00��\�zH8�#\�չ�/�Ə�\�\�mM^��b�t\�]\�x�6�\�Z*sJKgb|haK�\�[+��\�\�n!�\0��21�fD\0\�x�J$@�L�>��\�q\�\�A&Y���\�S2\�\�\�\0�\�@��l1\�\�\�f�yѤ�U�b�Ս�<���\�@-\�D�\�es���\��\�\�\��Q�[Oq\�}�\��a��\��!��i�(\�\�\0�$݉�6\�\��\��9\��i\\D᳦%�\Ze`\�ǰG\�.��T;rԴ�yx=o2^~�\�$#`\�,W��[h*�yi�\���\�o׏��#F;5�����\�W	H|EZ\��U��\�t\�Cm�W�vr$��Z�h�U���\�Ǫ{=k\�y�:��v��G�A=\�B0�\�z\�\��K��a�X�:�1k��a�X�g��k�Z�Y\�\�\�j=�U#ϛy1���J\�b@\�\�\�:��l�\�o��{��\��\�\��9\�YJ��4\�L-�e�\�1\0\�?�\�5�\�X\�@�Ss�*P\�\�\�o��d�\r�1[\��֦\�Ϧ�v�9?g�\�\�\�\�\�`��ˢn�[�u�����R��\����»2M[PzqU(����`3\�\�\�\�\�I�\�C6#�Y�\�\�`rr%�]\�r\�[b�E\�\�\0G\�#?�`2]X:��\��D\�b\�\�\�\�\�|\"Y _�\�_\�f<��$ճ\�S���X�A	\�i!\�\�-\�~�\�t��D\�H�(�\�-��\�,)\�w���ί��?���\�\�P��R:Gk\�l�_�\�\�Ӽ $�\�\�%^yFI�\�\�~%�/b�$�l\�|��_�[\�,�ODQl�eO\��\��J��\�.�2�rȔ�}6��̳��GV}J�\�\�sIal�\�\�h������Prъ(u\�˪�5��\�\�\�=/J\����\�i\�ޣhڧ�Rr]\���ç?�\\\�\�\�\'N�[�\�\�\\y�#\���Z\�NHڰI\�uE�\���\�\�OVez�\�\'����p�9����٦�Α��T.�T4�u\�E�\��<;n�8�R��p\"\���\�\�;Nv�\��\�r\�o�*���\��w�X�\�J\�\\*\�\0ܟ���r�VL\�4\�$1+��0eձ^\�\�bɭ\�E�g\0�\�~�}5�ʃ7\�\�QC��]e~�֥Y.z��\rK��@��\�\�\�=��rC\��,W\�\�\�5�?W�\�\�\�:뜲\�\\�\Z�Em\�Ї\�N�\0-�2�?\�	�.\'\�E�\�\�\�\��Tri\�r\�\�x.�\��\�\�q\�\��n�*�cΘhSb\�\�@4%�ys�\�.�z�\�M\�.��a�����\�)�T�9��͒\�\rV3\� xE4�<Ad\�\���TQ\�I\�~\�A;�{z1+�>�>���f��{�y�jwa�K�\�#[\�\�\08��\\\�\0�\���Ǽ\��8�.\Z��z\��\rѨk�LL\�Rs\�\�(\�#�\��\�\�n�\�V*{\�E@�\�<\�[��\�k�\�o�w8G�\\*��P&4`E\�4�؇:FH���\\JK���9;��\�oe�]m�\�ІpH�%k\�\�XC�C�\�\�\�$�W��\�wj[�V\��]Qm��s\�\�	Pkeˠ��+~\ZȂ��*�\0\"���\�q\�\�-Eu\�\�X\�\�5_�74�\��ѩ}��\"\")��\'\�:@�\�\�\�5���߭�e�¶\�q�\�hS\�¡ڧˣ��� |R�-Q\���[�\�8[� \�lc�g\"���\�5K�ESqS�\�,\�\�5Qp�_����m��ĺS\�2�\��4#�LP�:\\�>�ϵ4X䳢xw�l|�V\�U\����\�X\����\�C\Z\�t\�\�W\�Ϡ\�A����hS/H\�<wG\r��k?\�{�\nn��ʠ+W\�\n9i\�x\�a\�3�\�4\r1\rG=�\�ʂB@� \�|�k9@(\���3u�\\w��^�\�mXR.\�\�@�M�b7��k�\�G��\���\�0!I�(\�\�ТT�9���\�\�\�na\���X\�\�sw��\�_\�\Z�\�rȔXR\�n!\�\�\\Ϡa\��ٮ\�U,Ø��_\�z� =��\�\r��`y=��ĺw&�\�|\�.�\�\�\�\0\�\�\�\���\��t\�J��~�[�1\'F!��\�7Mf\'�\��#VO\�76\�-y\�R�3y��\r^/�q\�\0�-[\�\��9�Y�)���G`�p*j�x�eg\�aJ���Y)�zI����Y%Vދ\�I�\�Lg�$F���ğu�\�[ܬX!\�/�ϛ��\�R\��75^4�h0<n\��ǜ	(a\�H\�\�\�\Z*v�\�.Yc7f\�\�;\�AwvF�e\�+\�޲���a8\�L�yfR�\���̿\�17sF$R�|�ݾU�\���	H�\�;\�\�\�%Z\�\�\�G�-���w���LW\�H]/�7fV��\�\�!\�	�s�l\�\����\�t\";X\�\0\0\0\0IEND�B`�',1),('ShipperTest1@gmail.com','123456','ROLE_SHIPPER','Shipper Test 1','TP Hồ Chí Minh','0888888','',NULL,'2017-11-16 21:07:21',NULL,1),('UserTest1@gmail.com','123456','ROLE_USER','User Test 1','TP Hồ Chí Minh','086898658','TP Hồ Chí Minh','TP Hồ Chí Minh','2017-11-16 21:07:21',NULL,1);
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-04  9:42:19
