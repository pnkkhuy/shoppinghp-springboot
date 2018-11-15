-- MySQL dump 10.13  Distrib 5.7.20, for Win64 (x86_64)
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
INSERT INTO `accounts` VALUES ('khanhhuy215@gmail.com','123456','ROLE_ADMIN','Phan Nhật Khánh Huy','125 KP 3 Mai Chí Thọ - Phường An Phú - Quận 2 - TP Hồ Chí Minh','0932082309','125 KP 3 Mai Chí Thọ - Phường An Phú - Quận 2 - TP Hồ Chí Minh','125 KP 3 Mai Chí Thọ - Phường An Phú - Quận 2 - TP Hồ Chí Minh','2017-11-16 21:07:21','�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\�\0\0\0\�\0\0\0��4�\0\0�PLTEt�J`�B@X1\'\'\'\"\"\",,,666@@@BBB>>>999...***000<<<:::?J8h�F��[z�R�\�i��`4B+$##w�N~�Wb�Im�GE_5�\�m�̓�ψSy:Kl6�\��\�q�\�z��dJSC�\�vYyF777222�ь�ӑr�M433HIC��~&&%SjE),&N_Cv�h}�^\\�@�o_pT,4\'��sl�^[ODVG9.)%tZBĐ`ݡi��_PA2hQ<��WҚeF9.�qN\\I6��[�Ɍ�yR;2)�\\aD�Ɇ�hH�|U�UM>0ٜd�xN7/(Ԗ]�iEz\\?۞fB6*ʑ]��U֘`cL7nT<�qI՘_͏VҔ[�q6�\\�m1�u9�{@��E̍S�~D�h,�z>ךaɋR�_\"�e)�j-��H�c&ĄJ�w,ǇMГY�w<�M�S!�^!��E��V�vJK=0!!!)%\"pI&��IXE4hB ��5tW;ɊPVD2UC2R>-YG62,\'�P��?z�B��XUD4��{��f�i&�a@�lG�j-�Ă��t�tP��\\}]>��kՠn⺖ۭ�RB3\�y߶�^= ��TἙ\�ȫܦsⰁ\�α\�ˬ\�Ƨ��<\�ɨ\�à��L巌\�Ƥ澙�z;�[ְ�ϧ�ØrΤ~��mˠy�wDܠh�t3۝d;61Ӕ\\��f�ˉ׻�\�\�\���\������V�Â��f��t��Z��N\�w;\�a&\�Y\�g,\�\\\�g\�`�Z\�o4\�v\�y\����\��[\��ٓ[�j(��m\�c\�n\�j\�.\�w&�B\�r\�|\�d$\�m4\�w=ՂH\�[\�,��\�}�\"\�m\'\�\'\�(��\"\�,�Y%��\0\0\01�IDATxĘ��\�,\�QQ@#���_̌\�\��\�^\���>��덬\�\�L�q8\�sAt!�vc\�\��k�\��Nǳ9%L\\�\�BJ\�*A�Sa�\�!yk���4\�x��xKV\"�D��g���w��s\��\nc칭�!g��]�U�3�\�2E�H&>:&\�w\�ѵ]��M�qW\�\�_-\�\�y[�\���N]Bf�9�s\�][Z\�ai�W�ֆ��1;�Vaf\�z�G���S\�:�pz�¡`\�x��g\�%���5q�QKse�C�}A�g\�O��\"�uA	�I抂:&��}L_ӦXC���\�\r6�_\�?�=G��ꀅK��M�]\�N\�1�:��vI/�y8�\�R6���\�\�*I�ˋ,w\�s\� T,s\�\�\�ba��<����>9\�o�G\�G�\�%�0��on<\�T9�)\'�tlMņ6�퓎ҍxR�m{�@\\M\�1������P�\�x�0�\�\�v�أ��\��{e�s�&\�[0\�,q,�����0W.+Uv \�\���\�5R\"��\���F�޷U?��\�X�\�b��F]]K���\��\�Q0ژ�5Cr(�\�\�e�n�`�����\�+\�iٷ.�p.�\�*ji�\�?��\�fAbD\�\�\�\�\�\�se��}��\�\�E�e!�)O\�n��\�5\�(����\\�跲�}�ӆ񦲘ݏ�\�\�\�\�J�\�A�\�\�WV G/1���M����\�\�A��\�o;��i���b���\�΀�S��iT����v��K\n��\�>\'��մ\�\�ۘ\�\n�\�?��4\�U�T�Ri��\�\n�1\��\�\�މ\�0;\�)&�`�<\n���@,Tn�\rt+�Y�`;\�g�,NŁ�v\\��\�\�\��\�\�v�A�隹\�)p\�\�g�O`S7�\�p���w�Nu7��ue�\�2��NbQlhMx�o�AS_�4#s$�mW�~첄_0w���{MPQx1\�Z�\�\�C	���r�):\"܆z�oA�\�\Z��\�/�\�{�hMD�\�c���\n@�\�a�]h�?~�Kz7\�t�����QhMxG_aY�LjU\�!#�L\�\n\���l���&�>�5!]��\�L/�Ìsܦg֠��A�U>��;�,X��>�\�\�G#0\�\�V�\na��q�L&\�\'\�\�1k!�)�o\�R)�~\�5ЇC{�W98\�k�I�\�\�3/���az\��͇,1ӛ�Z\�\�\��ux:\�+\0\�f��cr��~_\�\�\na\�Q�w^��9<�\�\�\�׍\'_\�\�ײR@\�\�Y��պa\�/�ŏ\�\�ӽ��\�z���x!\'z,I��8S+�E\�\�i��\�3o���B��jl�[�\��p��ɛ�̪\�\�\"�\�\� :�w��\���o\�!a\\�\�\'\�F��o;�\�BE�����%r\0\�&��\Z\�UG�+�\�2\���Cs9�9KA)axzv�q\\,��7�P�>S\�p\�ؼآ�HD�[\�-k/��l�\�\\*�\�\�h�Dtytu�\��\��Q�0?7Mle\�\�i+Xּ�[�eV;BN됚˽��l1�\"R\�\�\��*\��B-zU*���\�ݒv��\\���sӰ��;=u�<RW\�=�Ǡ��[%}\����W\�L*�B١\�\�Z�\�;��l\�@��P\�d��\�X\�,�\�\�\�-\�\�8����-�ȫ/\�.?;���Q\�RH�F\�u�\�\�\�!Ֆ�e\�5�#��&R��i�<n\�\\��Ӷ�\�nm}A\�T�J$�\�\�\���ϳ��-�Q�&�L���k��\�7qJ]�\0�eD)��_XXBq ��\�B3q,Zuf�\�;�z\��4� mlP�\���.�\�\��\�,\\�	{v\���\�΋7+�Oe\�=�\�f\���SWc\��UR�5�[�+OF����\�Z0>�D�\� :�\�f\�Rs\��ĩq\�+�9}�iY[%G�\����G�3��\�\�\�y�\�\�~��0cz׉DԦ\��vD�v\�Ap��\�+��<��Gl*\�[�z\�X=k4�!���K\Z�x\�!�\�\�\�{\"Ë����;@\�-\�y�C<ceG��\�p�g\�R��\�k#���{�o0�r\ng��\�\�)\��(UWֈhn����\�U	Ȩ�\�\��\�QB�\�\�N\�\�J�\��cUֆ\�}8\�\�q!f>\�:}w�-�KJf�\�\�ݣ�����8Ya\\�ڝ�e\�J~p\�d\�!l�\�\��6Љ0SF����Eg\�¸Ss\�JW°�\�x_8O\�Kb���9/j\� ��\�eJu�&QOk��-�\�F4�6[ߒ�a渨ԍF���/i\��Z6ﮢG[6�\�\�C0��\�s�y�\����0����̻�\�9xy�-�3�\�\�\�wHG&O���c�O&\�.\�\��6I�M\�ʃ�5´��J\�D�\�0V*10�)j��\�\�Kiy�<��m\����(+�>̜�T�\�\\\�ד$A�g:���#�\�\�p<\�v�8�_�h��렂\�\�K^v`\�ByD!c\�?\�\"Am+ \�(�L5�/o�UpCT]�b&WI\�:Q�\�d��8�\��z\�s�A z�T�X\\|��-\Z\�\\D\\\� �����.ֈR��ZQ�\�b\0�\�\\��\�\"ږS2-.�B?e+㊬E��jU��F�\��\�~\�lߋ�=��*�>\�\�\�\"\�{o\�	\�VJgYvM-A�xE�D\��\�IMS�6�\�MC�\�d�\�K\�)��\��t�-\�\�R2���|�z��H)��\���W\�A\���	�\�rx�uz[9��ؘ\�)QB2j�\�Q�1ί\�v��>��ߌS��b���G�\\cBM�#�JZ\�\">¿\��U\��d�\�X���!|Si���\�\�;S��Nj��{8f���+\�X\�3\��\�r~n6_u{\�\�\�\�\Z,B!\���\'��\rH\�\�\��9���ݜ�\�_	n%\"�n.\�<ZW\�������\��z���]\��u\�C\��*\n�|��\�׻ڀ���F��o\�\�\�\�\�G?�����}\"\�|G.s��\'}\�6\�/�����\��EY\�\�1��\nB\�\�Z��&�mJ��}Z`Nم\�۲�!oeDJ�O\�/�$}S�~?�\'�;\"\�\�x�\�c\�\�\Z�~&\�®\�G7�;06\�q(\'4\�)bv\�ށ�\����eQ�l���8β\��4W,\�~��1\�0�h\rcLD\�-\�D\��d\�\�\�\���\�:�֦pB�\�F\�hcx�=\�\�sn\�\�C�\04t[�.��R\'����m�`���dl6\'7X\�8{,ܜR:���e\�\�\�`\���f.@\�\ryc^�֯�J�PR>\�S�z�=\"~�\�5ީ\� \�dY�\\ŋ\r�aWG�\\\�׶d�&\�`\�#+�Ur��U��8�n\�(۠XV\rn�2�80�9\�2\��P}Mn\��b��\�<�Y|��\\3\��E����aL\�\�!f��X�[��\�\�:	n���0\�\�\�-���\�\n�����\�qq$&̤��l%�`�\�M�0�_�$�H\�\�(���%b~xn\�V�FB\�\�\�\����r��i�\�u1�\\L&(Evg�FO=-�BƿMƗ*\�\���ʯ�e\���\���UR�a�7�\�V\�\�d\�:��+�\�\�=\���\����,Ѡ\�\��\��5�:�>ӂ\�\��@E�����\0�iO�c_y�w@͒�j�q�.^|H7F������Ǔ\�|n�y?*7\0�̂\�7�.�J/|-�\�ϵ��i�e�I[\"@bta5	1e;�a���&\�\r,p�@G͖\���Vl\��v}�Ω^�-:��\r�PO&7?��/y	*�d�e�1\�Gݬ����p�}����O\Z�\�*\�(�\�v9�A\'�\�\�\�24=ɫ\�24!\�P�\�)ݕ\�\�\Z�k����F\�h�A����\'S��~/\�N\�a\���6֗�Ҿ͜W�W\�:y��\�M	�C\��:.z��\�\�\�\�]����)�Bi\�M\�s\�)\�y\�p\��gm�n�K\�ݍ(z+��]z<\�\"\�XJ����|_���<	C7�\�\Z�W��w�N^�\��EF~�3�\��^� \�d\����\�,��\�_\�\�K�\r��Z3�۱�_\�k\�\�\�*\�ck\�dҼz�G$\�p=�\�\�yB-�\�\�y\�D/\������S\�\��/\�r&���*a�ʥ/�\���o\�\�\�E��\�B\�\��� �r\�3�|zlI\�pΉ\��\�\��o�\����_��+��=\�\�\�\nz\�;\�}�,b\�+\�\�\��:j8@h�\�x=ȎQ\�\"\�%<�\�/	�D��gԘ\�\�0.a�6�\��V�tpb�����\�\�0,\�\��������\���\\!�\�f\�\r���Z\�T!\"\�\�\�ѹT\�\\�7�舴�\�\�]��nS�H)�8i��\�X�ګ\������I%���ȃɮ\��j\\\�i۪{\�jM\�3��\�m�ato$\�\rG���FZ���`	��\�z*d7�\�\�Ђ*��g\'˦샐4؋^r�\�,�Nni�0?\��B{u+�����\����*�O\�4\�j]��\��cH\�}�w\�\�\�0\�={�\�\�%�jGa\�\�jZ�$�S����#\�_\�\�#��\r�\Z\�SѶ�\ru�����]\�5�]QQ@�\���O��\�g��\Z\Z\Z�4\�P2\"y\��������\�׼6o\��fG�:�\�U\n�,{�1�Z\rG�����\��R\�K{/\�\�턿zt\�\�b1<�0\nI\0�x\�}l�0\�\�^QHD}��\��\�D�I�4<]<\��q�	F���w?Ú�OǩĥY�/��p\nѯTQ\��eg���Z\�,b�\�\�\Z��\�6�\�D(\�19ټ*�0܀\�劝X���˛pM4/-ѧ�˓:�,;k<��5mĽ�2�599	�	�\�x��T%M\�u\�˫\�˃\0\�\�1�P�\�A\Z~JT%\�\"\�\�A:\��\�\�\�Ǐ�9\��\�\�\Z��5�H�w�X�\�Y�\�j(\�z\�L�=)`j�scބ�\�$2\��^\n��3_,����*��v5SI^\�R�o\���\"\��\�\�mo\�\�\�t\�s����8�\�r�\�t=x�R`�cO�O\�Rġs\���0~����h9��c�\�+mo�\�zs�%t\n�..�\�Ķ\���Vނd���*h0PⰵNN&\\\'\�\�\\樵��H��pm\�\rR\�\�^�\�93+̵Ň7ԣ��xY\�_��ͯ�Z\�\�\�\�iUI?��ꉼ�Q\�t\�\���g��c���\�@\�?�q�m�D}�f\�9��/[Vݕ%\\�z��\�:�	ŀ�ۀ\�\�u]K!-Ц�~���,x&8�\�\�\�\���SJ�\�\�O?�\�\�2s�G\�\�\�e�[4U��\�\�<_ơdt�\�\��.�pn\�9	��\� !z���^��\�\�+�\�\0�u�ΊܞZ�a�����\�\�\�_����\�\�+u\�9�r%\�q�%\�\�O!�Vc���щ�X֫�G\Z(q�Q4��c��T�`\�l\�׿\�<ny5�͚^�����˼\Zŕdq5/\�\�K^\�	��\��\�SH���K\r\�҄��)ߎ*g/�,��\�\�5�\n��#�?�8x�\0�Z\��Z\\X�/��I2\�!g)\\-m��0g�NLM����\�\�^�j.���\�2؉qB/G?޽\�P\�\�W\�I\�\�y�la\�\0�) \�b\�\�A�\�\�R�jq�~\0��\�\��\�\Z\��3T˝�^t2(�xC��\�\�c{��E�>uj�\�Jgne*\�\�/\�\�[���<\�\��D\�\"}��1q��O<Z\�\�7͹�E,\�\�\�\r�m~�\��xq�zRB̲m-aYVa��H�gؽ\�5\�ye�l�OGH�\�P�r	&ȆO�04CP�B^\�W��Ή+�\�\��j�ה\�+�=i�z�\��\�\����\�2\��f��E�ꇫ����\�SA#{�\����W>@D9=F�px\�\�\�~6jI)���-\���،x�8,Mϟ�\�����\��s\�\�\�)��\n�z���\�yn1\�_�@�\�I)�\��\��[�~	X�\�h\����4zلDtlt��B��XrT\�#ϫ\0=CX\"�\�\�\'=.��@�<��^.\�\��\0D\0�.�\�<��;b\�u���\�U\�9�U\�\�t\Z���}�\�\n\�i\�~6*�!5\"\0���-J\ZY\�^�ū�jds\�Y/�\�\�/\�\�C�:\�^��^+\���\�\�o0W|�����K%w\�\�\�\�N�\�	�_\�Qp&��R?�~���{.\�\��Oܦ���\rI$ԧ��y�\�\�\�TI&\��/\�gr(�\�\�bvj��~��1\�U�a��y�����\�\���\"��	h��0��~W���=�1R)LG<d9ZWp\�\�\�H[�\�_`\�_E�\�;\����($��\�\�\�\�\\:@��,\�4� ��=�C5�\�\�]ѿ-�\�7�\�V�^�jD���\�Tzo�\�g\�@2=��pjo8�Ӱ�\Z\��2}�\�1�\�DF�ɋ;�\�%U�2a\��Q������\�e~Q�|��\�\�\�l�W\��%._j*\��įIW*5�O\�җ�3\nz����\Z�g�ګR��t��iU�b/.2\�%f��.�v\�S��!��=*\����I��\�^�!`Y�==B��t\Z\�\r�5��D�@\��\�\�.(�\ZzF\�\�)�\'����1�Er\�x�i�\�q\�\�6|\�P1\��\�*�\�\�\�Հ��&Ć����3\�Ŀ6\�\�B!�!f\�+n����7�\�=VA	��QI��4�@�s(*�Pr��\��J�o.;Eeo\�L0S�\�l\�\�H^@�\�;S\�\�9)\�\�\�\�w#̰\�44/w)L*`bb�\��^+�L�9B\�Z�\�8�A��_)b��M\"<\"\�߃|\�뤁^�7v\�S\��A�4�Ҕׅ&&*\��gFT\�^H4I9�i\�T��!%��\�\�o�Tb�U{�^�\0�80j\�p�~\�0M�\�g�\0��[4|^R\�L�64M`��n�h<��q`C��S\�\�?�\�n\��(�aE1���aT�2�\�٢߈�\r]7\��H�:_з�\�\r\�3\����5n\�\�\�3\�=I\�2G\�Cc�U\���}\�_�z�R\r�St��2Q6t\�\�ыdA\��EFM�\�a\�)��P\��sՉ�M ��\�x��ή?�R\�d��!Ҕ�_�T��\�\�N��\�\�%�Y4�\�\�ա\�\r�L��\�\�E�w�$鼨7\�\� �z\�!l��T���\�ցV,�	���@Ҁ�e\�Qn�M����\��]�:r;�`�\�\�\0`�\�R��ީTꆵ�.\��Re9�\�W��\r�� fއtX�ӆ\�JRki5��=\r-\�e��!,^un8obfv5)_\n9\��4wvJ�\�p�\n�\�^�[���ΐǎ\�m|ȑ���sy���]���͇��\�l��87st��ƙ�>\�ָf�H+ �d���\�\�\��gfoK��x+\\\��\�Π$�4r��[E+S���kԉоt�:hc\�\���\n�<\�\�H\'\�<\�{]�k�U9\����`�\"~�OړZ�X̝0R�����+B�\�0u��he��\�\�2�\�	UVYV�M,չ;\�-.�U���߃��\�\�\�O<���\'\�v>��LQ\�A	f�\�;��4\�=-�0�I���G7�\���Db��k*�\�\0`\'�r\�?�K\�LM%�\�i5�[풰ru�\�\�	�����ŷ\�\�_�&?$�\��y�q��8*\�o�\Z��K\� ��LH����.�V&�R���ၷ�����*ށ㪻�HW}2K��^Lf_!dD�*�\�$�J\�u0�m,a�\�^f\0b\��\0�\�?\�6�\�{cM����hŖDʲE��\�{�z\��=ٯ�\����[�-mSu&�a��v\�p8���-X}�T�-\�4\�\�ɚMh=*�hC�F�K v�|\�\�\'�O�R�&��\�\�\��\��\�`�WO��ꆟ�\�kCL.L��[:\r��\�\�Փ\r\�\� ��\�E��\�X�\"ƈH�MU8\�t!\�\�J�qj\�׈�\Z�N\�9�MJ�$�\�@С�*�`e\rWU\�)�ѕ��u\��\�6��S���<�Zc��\�`���*�����~��\�f*��i�^~HK�_rT\�E\�>K��Fs^���g\�l\�X\�\�?\�kc��!n\�|}9�\�!@64 P3G\�*�`o\"L�dj��\�&񿢈M-.\�z\�\�͈8\�X��y�\�\�4\�u\��\�^�\�=�L�\�\�\Z̧\�\�]Ȇ�AH?�\\��V�e$�u���)``��㋝N[t8�Y�\�W�\��K�ެ\�Y\�,v��\�\�<��8\�`8vz\�w��\�5Mn<l\��S\�w.8P�\nqD���\�M��\�\\��\����4\�\�\�p�\��ٓ�v��G>\�^�\Z�5dfHc�C�0�Yt�J/!\�\�,�gj3\�C�k7b�U��6���5\"5S�GB7�\��ä%$-(�\�\�d\�\Zvn�A5.�k�����B�\��mfoܖ������\�\�Ҁ�*)V]88*7��:E�,9�j�\�䕍p�2t�y�\0\�m�����v׺�r\�õأo�B���\�\�lv8��z�jk%�þ\�P:;bA\�t5�\��6\r�����3�L:\���h�q��\�#\r���\�W\�\�\�Z��(^��J�r�l#j\�\�a+b��D�h�\\j�l\'u\�myYP���\�͎EąV��|dn�{�׬OKk�\�K\�cǖ{\�3\�\�0�ڡ���\�ۙ�{!ߏ���\�W\Z6@�*Ҝ\� \��?J��,\�)\�IDz\�\�Ğ�\�v/��VC���\�ru,\ZB5Ή��\�\���l%CJ�\�i\n94#\\\�v\���U;\��P\����\�D$��\�\����ڕ�:7\�\�\���\n1����\�۹I\�\�L]�L�O�+�y\�R�t&��@tN�N��\rck�\�dq\�8׫�f�F�Ӱ#\���S�r!DIF�\�8\��A�\�Y�V|\�:\�=���W\�\�p\Z�4�@V�Ʈ\�vszt�\rg������Vܻ�?>���P-\�+�\\��!�q\�S�Kb��\�}\�~�l,O����i�$\�֘\�U|\�{\�U�\�\��\�\�r�oo�\�\��$\�`�Y\�b$\�/�\\��i%�K���hz�آ�B@Jꁓ<Y�\�\�1DM%_�\�`��9>Y������\�=d&��\�\�݋�t\�\�P�Bİ\�\�\�\�xK���!�s�\�㓕�ΪZ�\�K�\�\0\�!ѱ\0^A��WTX,\�=D\r\nhO&�o)!���6�bbS��W��_\�M4\�S\�P M�����r Es��aQ\�\Z,��\�k�!j�g*� \�6ˣ���\�\�TÛ\�6\��\0\��\�b��\�k�~=�\���0��DP\�m\0�k\\�x1aA,,0Me%\�aA�\�Z�\�_[�|�yB\�Ed��a�CXvbc�\�n.j>\����@��r\�jb\�t\�d��\'\�ѨT�u(��#\�g\�5�\�SͰC~�/�\�A�1�\'\�I(y�?jh\�\�\�\�P2Ş=$�QRC�2\�ڃz�\�X�\�XhU��+݁�a�������-\�x�5F\nWR\�1�\�-�An\�\�\�MG^9f\�\�\"Ԑ�,7�w�\�\��)\�:��+G#g��\�-�c\\�J+\0)q�!�e^�Im>��h\rR�\�!1���\�S\'N\\�x�\�\�bf�j,�Q�.-*;\�O��\��Gգ/;\�3?.~�Ch����ESOla�r�%�K��YK4���XA[P\�\�C����Fo��\�Pg3���Q|��;����B�\"\�V0\�3\�\���X��\�\�\�1�\Zڐ\�\�IEKA�ҿNltM[\�dDlfZt1�,�����`X���W�\��r�\�X-c\�Q\�\�\�\�`�+#\��\�\�L2\����bi�\�\�\'ٜh=�\�ĉ8�2����L\�|�H4\�ӻL�ire�9�l�7�@K�C\���]\�$��\�Y\�IpE\�)k\"Q7�Ao�J��uE�51\�/�zK\�{��3�Ni1E\r\�\�9Xu$f\rW)��\�B��\"L�\��v\r\�W��|�\�<�~��\�F?��_�f\�\�!/\��	\�mGe2Xe�	��tnFX�\�w6��\Zh��w�\�\�+���k�M\�اv\�\\��mP�2L�,+_�x(zZ\�4\�\�2Ҳ\�5\�<*\�ĺ\�tLn\�\�%\�ܙ=�t\��VcA,]��|.\�>ZZ+ӹ��w���5�\n���\�x/Fr�3�.�%S�\�\\:\�ޒ\�Eg{+\��v��)\�\�F�����/b#b�\�8m�\��\�ᩛ�ݬ��ͥc�r;p�s�oް/#\Z��8G	n���Q\��]t\��~#�y4e!\��\��\��).W\0c\�[\�7�ǵ)�K�����\�=�y��~�\�0\�[`@ \�~\�.\�6�|=\�5����\��HK\�k��F\'\�\�\�\�\�rc\��(s\�Ӿ�\�t�\�F��7\�\n�b��Y�~\r��nL\r�-\0S)���\��0�\���vܤ�i}eB\�-\�ӓ��\�TI�_���D#�\�\�\�3��%�SL�l=PyN^D���)�)�\�[본\Z�T\�C�7=%��\�.����(\��),q\n6�7ۦK�J|P�\�DMw܄i�-a�PEt��\�]۲��\�\�\�l[�n\�\�L^�\�]�Pr�EW��H\n�k\�c��i\��J\�\�\'\�E��ǰ	q3$p��\'Et����Gd�M\�\��`���\���\�&\�\�`ݲ#>�a\�\��\�/m��b�\\�炸E��ǒE��\�.�O\�)\�-H��#����pI`K�\�\�!m3�o\�df\Z�\�\�\�Ͳ\�җ&w$�f3�\��\�=.\� p1}0y\�`�嚍I�\�P*\\,@���a?�\�	�H�/����*�U��\�H\���6ͻ\�;\�j\'���w�[C\�y.w�e=z ��8\�\�|�B�\0�.�FHB\�I�$pI`�vmƑ\����fl_\�\�-�\\{��Z�\�\�4�p�̣��a\�\��\�\�\�\�觌xh\"\�0\�\��C\�(`\�\�m�T�\��_�p�n�\0��le�Z_&\�U�|�?�k�,%S�j�}k5`�n}2�wVõ\�c|��\����\�Y\0[�&q�(\�\Zf#\'J:/3\�c�+���\�C8\�	C\�7\�&��\����\�\n	�\�e�>\�\\rO\�[�\0��� \�G,�Omv��\Z\���s\�ͫ\�z\�!��v��ym\�\"�ǲ\�\�K?\�Řf\�ks\�Ӫ`���+�\��0\�\�F>\�\�s7�y�\ri��<�VyW�@Й�َʂ#��q%w�\�\�\�`aV^Y@?�_)ߪ��\�8�\�zx\�370X[\�pUެ�\�\�YV$�m�=~Mw�{�\�Q�br\�\��^��T���xcƬ��\�\� tk�\�~ӪFȉ\���c���3K\�z(��1-\��K�\�=��(��\�q�<G	h�-ı�\�\�X\�\�/�ݾ\�\�;�=�q~\�4qۤ�\��]SQG\�n�_}�-D��V�_\�(\�\�3s�)&s�X(\�\0J\�\�7\�0\\ޞ`�\�A}���\��\�$C<b�i�=�S�\�\�D\�a��8\�,#�:��(���WNĻ�\�֐GMqT��#!\�(���.	���\rk%�\�\�ݧ\�M�߻�\�\�\�\�\Z\�\'YB�\�\���\\�v�h�~@\��\�de��mP\Z����amݱ�����\�\�Fj|].\�dn�q�\�\��Z��1�� �:Z�\0�<%:\�N�R�o]3:b[7m\\��V:\�\�J��\Z�M�r\�\�5�\'Y,�DXt\0B\�\�Az��;e\�Ȯ�+��l�f��잂9�`�E��\�\�\�3�Vg�p9�j3ͦݏ���\�\�lJ&�?�֬\�ZF�m\��}�T\�\�F��\�\�\�#L�z\����\�\�}�Ն\�[8Z�e.��\�\�ŷ\Z2M�����xpȠ5�)T\�4���\��E���^xТ���x�\�-\0 \�\�&h\�\�\�Z�\�ﱯ\�\�\��۝m\nV��0�g�\0��\�l���~�Nе����BQ$/d|�P��V�\�2Úx@��ց�\�\�l\�~t5\\�s��ONv!���:\�)s�~ +Ȓ\�\�.O+ME��^x�|I�J\������ψ�.�\�m��%�\�\�r�=\0\�����$\'\�H\�\�;:g�\�_8>ىg�k�w+F}��/�\�\�v9vI��g�g\�\�Н�K�ދ��\�4\Z�\�lF$I�\�F�\�\"��b�-AM�~	�W�?�?^;\�4����\�a\��`wg\�Q�\0\\9<ȫ�\�7\�:{�\�\�\�\�)�7��\�JD5\�	�D8bOj\�v�\�I�\\ a�0/m\"jkڬ#\�T�\�\��\�\�|u-\�P�\�\�A�	\0r���̏�I\����\�\�Kf�a\�\�\�w\�k,���g�{W\�Z)�H���x\�\�.)c��\��B��tU�\�5	\�f\�\��\�\�>\�ɟ7�0^��ߧƲ�\�,��D\�G\Z&��\�\"\�\�\�u\�}pͥ�\�\�v��Yh}R���\�ϭ۫\'[\�\�/O�?�{U��\�)@N���i�\n�V�\�A�\��c,���ێ\��� ��sSd�q�J\�-�սʀ�K�͛�X7I!��@�5�\�n^[rv	�ĵ\�0\�-�@\�\�3Rq\�眆s\�/\�5�m�*\�L�$��COA�����$Z�Ԉ\�hA\�PK����\���\�8X�\�\�\�\��\�5\�vx�Q\�S\�\�c�+\�\�^j�EA\nőQգZ	}\�ٴ���_4��ivq\�\��\0\�Q� m8\�\Zk\��1���\���)��@VHA�\�b�[�\�\�m\�O:�П\�(����\0�E�d\�o�\��\�qZ\�\�\�\��\�.A/\�\�D\0�\�<�\�\�	�5�$���\"H��B\���q\�\�x�\�\�v\�\�~TO##�\�8��$i-\n �5hľ���O\'����\\2�K\"Q�\'�@�>G�\�@wGj�s4덎q\�j\ra�80���D�K�_��\�\�u� \0�֐\Zb�\�\�лp\�<��02֗Gi��Z/z{\"\ruɞ�\���\��Y�*#V���u�c�	Ě��=$�8U�4C0\���k�//U^�\�&\��g8}��J,<Š��\�F-FQ\�\�fu�y��巺(l5�4o\0���%\�\�v\'�\���\�,vu\�s\r\�hݭ[uLXo��\�N�1�h�ѯ\Z��\�֨��򜤏h<�[~b\�~s\�2[�x\��\�3b7\�>s��J��\�\n�+�\�P�%\�Z��*��\�y�g<&I�\�D�8=����{\�L�M\�_�y}u\�鉗Z��}im�,+\�Sm\���i<�\�9�h<q\�y>7P�݁,�	OG4!\�\0\�\�\�sإ\�\�M\��\�e�D�\�\�uW����K��Q�\0��\�g�\�piM��]�^9\�y\�l�^��\�\�*��?:��4)��:C��� z�+\�e\�n\�>/v\�ʽ�\��k��\0\�\�;}�\�0�G��\�\0�m �\�\�Y���\�\�#��l\0d\'vNu\�ՙ+X:��kk\�V\�\�\�w�\�\�wЁ\�\�֭\n`�ѤZ#�_\��oZ���\�nyN�\n(��&�2\�%�\��Ȫy�\Z�\�����\�\�Ɲ~�\�#�g��\�W�ˑ�)\�f\�\�m\�\��ٸ(7_4^\nC<O�Ԩ`�V�h���\0R��!\�ޠ\�\�t<+�w\�k�$�����OK&\�0\�)V\�/�\\*�!BɌ�ƴ�zO\0\"�\�u\0�\�\�:�x\�`�F\\$�$4�p\Z�Z;r\�\�\�FE�<�25�FV~iPU`|�,.Q\�EJ\�f0䱞�7�\��I3i)\�\�ā��\��+\�\"�ѬT�Py���\�+~\�\�L\�\�WU�q`O\�{u\�	v͈8�9(\�\0��\��\"���,hf��\�\�\Z\�y�,\�b!�͇���\�̑s�2	\�\�|��D�áJ�/]�����,$f^5FH\�9H)��y�x!\�g<\�8^۵�(�\�\�\�\��V�\���aDg�%�v\��s\��Z\\t|Ls\��C1��C0L�\ZH<�>\��\'z�\�n$t�\0\0\0\0IEND�B`�',1),('ShipperTest1@gmail.com','123456','ROLE_SHIPPER','Shipper Test 1','TP Hồ Chí Minh','0888888','',NULL,'2017-11-16 21:07:21',NULL,1),('UserTest1@gmail.com','123456','ROLE_USER','User Test 1','TP Hồ Chí Minh','086898658','TP Hồ Chí Minh','TP Hồ Chí Minh','2017-11-16 21:07:21',NULL,1);
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `CategoryID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `CategoryName` varchar(200) CHARACTER SET utf8 NOT NULL,
  `Description` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `IsActive` int(11) NOT NULL DEFAULT '1' COMMENT 'IsActive 	=> 	''0 - is not Active''\n			=>	''1 - is Active''',
  PRIMARY KEY (`CategoryID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Quần áo','Các loại quần áo',1),(2,'Điện thoại','Các loại điện thoại',1);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `images` (
  `ImageID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `Path` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Decription` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `CategoryID` bigint(20) DEFAULT NULL,
  `ProductID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ImageID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetails`
--

DROP TABLE IF EXISTS `orderdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderdetails` (
  `OrderDetailID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `OrderID` bigint(20) DEFAULT NULL,
  `ProductID` bigint(20) DEFAULT NULL,
  `Price` decimal(13,4) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Discount` decimal(13,4) DEFAULT NULL,
  `Total` decimal(13,4) DEFAULT NULL,
  `ShipDate` datetime DEFAULT NULL,
  `BillDate` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `IsActive` int(11) NOT NULL DEFAULT '1' COMMENT 'IsActive 	=> 	''0 - is not Active''\n			=>	''1 - is Active''',
  PRIMARY KEY (`OrderDetailID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetails`
--

LOCK TABLES `orderdetails` WRITE;
/*!40000 ALTER TABLE `orderdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `OrderID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `AccountID` bigint(20) DEFAULT NULL,
  `OrderDate` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ShipDate` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `RequiredDate` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ShipperID` bigint(20) DEFAULT NULL,
  `Log` varchar(2000) CHARACTER SET utf8 DEFAULT NULL COMMENT 'Status 	=> ''Watting - Unpaid''\n		=> ''Shipped''\n		=> ''Shipped - Unpaid''\n',
  `Status` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'Status 	=> ''Watting - UnPaid''\n		=> ''Shipped - UnPaid''\n		=> ''Shipped - Completed''\n',
  `IsActive` int(11) NOT NULL DEFAULT '1' COMMENT 'IsActive 	=> 	''0 - is not Active''\n		=>	''1 - is Active''',
  PRIMARY KEY (`OrderID`),
  KEY `fk_Orders_Accounts_idx` (`AccountID`,`ShipperID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persistent_logins`
--

DROP TABLE IF EXISTS `persistent_logins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persistent_logins` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `series` varchar(64) COLLATE utf8_bin NOT NULL,
  `token` varchar(64) COLLATE utf8_bin NOT NULL,
  `last_used` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persistent_logins`
--

LOCK TABLES `persistent_logins` WRITE;
/*!40000 ALTER TABLE `persistent_logins` DISABLE KEYS */;
/*!40000 ALTER TABLE `persistent_logins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `ProductID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(200) CHARACTER SET utf8 NOT NULL,
  `ProductDescription` varchar(1000) CHARACTER SET utf8 DEFAULT NULL,
  `SupplierID` bigint(20) DEFAULT NULL,
  `CategoryID` bigint(20) DEFAULT NULL,
  `QuantityPerUnit` int(11) DEFAULT NULL,
  `UnitPrice` decimal(13,4) DEFAULT NULL,
  `AvailableSize` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `AvailableColors` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Size` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Color` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Discount` decimal(13,4) DEFAULT NULL,
  `UnitWeight` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UnitOnStock` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UnitOnOrder` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `IsActive` int(11) NOT NULL DEFAULT '1' COMMENT 'IsActive 	=> 	''0 - is not Active''\n			=>	''1 - is Active''',
  PRIMARY KEY (`ProductID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `Roles` varchar(45) NOT NULL,
  `Description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Roles`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suppliers` (
  `SupplierID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `CompanyName` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `ContactName` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Address` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Phone` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Fax` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Email` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Website` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Note` varchar(1000) CHARACTER SET utf8 DEFAULT NULL,
  `IsActive` int(11) NOT NULL DEFAULT '1' COMMENT 'IsActive 	=> 	''0 - is not Active''\n			=>	''1 - is Active''',
  PRIMARY KEY (`SupplierID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-11  8:16:24
