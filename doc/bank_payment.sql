/*
Navicat MySQL Data Transfer

Source Server         : offer
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : bank_payment

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-12-12 14:02:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `account_id` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `account_tel` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `user_id` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `account_password` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `idenity` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`account_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `account_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('20191211234806720', '1124213', '20191211234806720', 'e10adc3949ba59abbe56e057f20f883e', '1231243');
INSERT INTO `account` VALUES ('baijuyi4568', '15188823455', 'baijuyi', '123456', '528320199901033415');
INSERT INTO `account` VALUES ('daobaifeng2354', '15188812354', 'daobaifeng', '123456', '528320199901012354');
INSERT INTO `account` VALUES ('dengbaichuan2534', '15188812534', 'dengbaichuan', '123456', '528320199901012534');
INSERT INTO `account` VALUES ('dingchunqiu2435', '15188812435', 'dingchunqiu', '123456', '528320199901012435');
INSERT INTO `account` VALUES ('duanyu3524', '15188813524', 'duanyu', '123456', '528320199901013524');
INSERT INTO `account` VALUES ('duanzhengchun3452', '15188813452', 'duanzhengchun', '123456', '528320199901013452');
INSERT INTO `account` VALUES ('dufu3455', '15188882345', 'dufu', '123456', '528320199901073418');
INSERT INTO `account` VALUES ('gaolishi3245', '15188884568', 'gaolishi', '123456', '528320199901047616');
INSERT INTO `account` VALUES ('libai8888', '15188888888', 'libai', '123456', '528320199901016712');
INSERT INTO `account` VALUES ('liqiushui3254', '15188813254', 'liqiushui', '123456', '528320199901013254');
INSERT INTO `account` VALUES ('ruanxinghe3245', '15188813245', 'ruanxingzhu', '123456', '528320199901013245');
INSERT INTO `account` VALUES ('suxinghe3542', '15188813542', 'suxinghe', '123456', '528320199901013542');
INSERT INTO `account` VALUES ('wangyuyan2543', '15188812543', 'wangyuyan', '123456', '528320199901012543');
INSERT INTO `account` VALUES ('wanqinglan2345', '15188812345', 'wanqinglan', '123456', '528320199901012345');
INSERT INTO `account` VALUES ('wuchangfeng3425', '15188813425', 'wuchangfeng', '123456', '528320199901013425');
INSERT INTO `account` VALUES ('wuyazi4325', '15188814325', 'wuyazi', '123456', '528320199901014325');
INSERT INTO `account` VALUES ('xuzhu4235', '15188814235', 'xuzhu', '123456', '528320199901014235');
INSERT INTO `account` VALUES ('yangyuhuan2345', '15188883245', 'yangyuhuan', '123456', '528320199901056722');
INSERT INTO `account` VALUES ('yunzhonghe2453', '15188812453', 'yunzhonghe', '123456', '528320199901012453');
INSERT INTO `account` VALUES ('zhongling4253', '15188814253', 'zhongling', '123456', '528320199901014253');

-- ----------------------------
-- Table structure for card
-- ----------------------------
DROP TABLE IF EXISTS `card`;
CREATE TABLE `card` (
  `card_id` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `card_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `card_tel` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `card_name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `idenity` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `card_m` float DEFAULT NULL,
  `card_password` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`card_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of card
-- ----------------------------
INSERT INTO `card` VALUES ('1', '1234', '1124213', '代利文', '1231243', '20191211234806720', '3800', '123456');
INSERT INTO `card` VALUES ('97518888', '6226095711989751', '15188888888', '李白', '528320199901016712', 'libai', '4000', '012345');
INSERT INTO `card` VALUES ('97523455', '6226095711989752', '15188823455', '白居易', '528320199901033415', 'baijuyi', '4500', '012345');
INSERT INTO `card` VALUES ('97534568', '6226095711989753', '15188884568', '高力士', '528320199901047616', 'gaolishi', '6000', '012345');
INSERT INTO `card` VALUES ('97543245', '6226095711989754', '15188883245', '杨玉环', '528320199901056722', 'yangyuhuan', '7000', '012345');
INSERT INTO `card` VALUES ('97552345', '6226095711989755', '15188882345', '杜甫', '528320199901073418', 'dufu', '8000', '012345');
INSERT INTO `card` VALUES ('97562345', '6226095711989756', '15188812345', '万庆澜', '528320199901012345', 'wanqinglan', '8000', '012345');
INSERT INTO `card` VALUES ('97572354', '6226095711989757', '15188812354', '刀白凤', '528320199901012354', 'daobaifeng', '8000', '012345');
INSERT INTO `card` VALUES ('97582435', '6226095711989758', '15188812435', '丁春秋', '528320199901012435', 'dingchunqiu', '8000', '012345');
INSERT INTO `card` VALUES ('97592453', '6226095711989759', '15188812453', '云中鹤', '528320199901012453', 'yunzhonghe', '8000', '012345');
INSERT INTO `card` VALUES ('97602534', '6226095711989760', '15188812534', '邓百川', '528320199901012534', 'dengbaichuan', '8000', '012345');
INSERT INTO `card` VALUES ('97612543', '6226095711989761', '15188812543', '王语嫣', '528320199901012543', 'wangyuyan', '8000', '012345');
INSERT INTO `card` VALUES ('97623245', '6226095711989762', '15188813245', '阮星竹', '528320199901013245', 'ruanxingzhu', '8000', '012345');
INSERT INTO `card` VALUES ('97633254', '6226095711989763', '15188813254', '李秋水', '528320199901013254', 'liqiushui', '8000', '012345');
INSERT INTO `card` VALUES ('97643425', '6226095711989764', '15188813425', '吴长风', '528320199901013425', 'wuchangfeng', '8000', '012345');
INSERT INTO `card` VALUES ('97653452', '6226095711989765', '15188813452', '段正淳', '528320199901013452', 'duanzhengchun', '8000', '012345');
INSERT INTO `card` VALUES ('97663524', '6226095711989766', '15188813524', '段誉', '528320199901013524', 'duanyu', '8000', '012345');
INSERT INTO `card` VALUES ('97673542', '6226095711989767', '15188813542', '苏星河', '528320199901013542', 'suxinghe', '8000', '012345');
INSERT INTO `card` VALUES ('97684235', '6226095711989768', '15188814235', '虚竹', '528320199901014235', 'xuzhu', '8000', '012345');
INSERT INTO `card` VALUES ('97694253', '6226095711989769', '15188814253', '钟灵', '528320199901014253', 'zhongling', '8000', '012345');
INSERT INTO `card` VALUES ('97704325', '6226095711989770', '15188814325', '无崖子', '528320199901014325', 'wuyazi', '8000', '012345');

-- ----------------------------
-- Table structure for check_record
-- ----------------------------
DROP TABLE IF EXISTS `check_record`;
CREATE TABLE `check_record` (
  `check_id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `record_date` datetime DEFAULT NULL,
  `card_id` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `card_flow` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `payfee_id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `payfee` float DEFAULT NULL,
  `check_status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`check_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `check_record_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of check_record
-- ----------------------------
INSERT INTO `check_record` VALUES ('20191212134652651', '2019-12-12 13:46:53', '1', '20191212134652651', '20191211234806720', 'liqiushui2017', '6200', 'success');

-- ----------------------------
-- Table structure for loan
-- ----------------------------
DROP TABLE IF EXISTS `loan`;
CREATE TABLE `loan` (
  `id` varchar(18) COLLATE utf8_unicode_ci NOT NULL,
  `student_sno` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  `account_id` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  `applicate_file` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `applicate_time` datetime DEFAULT NULL,
  `loan_amount` float DEFAULT NULL,
  `loan_name` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` int(4) DEFAULT NULL COMMENT '状态（0：未申请，1：资料提供成功，2：审核中，3：审核成功，4：已完成缴费）',
  `payfee_id` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of loan
-- ----------------------------

-- ----------------------------
-- Table structure for payfee_info
-- ----------------------------
DROP TABLE IF EXISTS `payfee_info`;
CREATE TABLE `payfee_info` (
  `payfee_id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `user_id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `payfee` float DEFAULT NULL,
  `payfee_date` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_id` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`payfee_id`),
  KEY `user_id` (`user_id`),
  KEY `student_id` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of payfee_info
-- ----------------------------
INSERT INTO `payfee_info` VALUES ('libai2017', 'libai', '5200', '2017', '1061030417030401');
INSERT INTO `payfee_info` VALUES ('libai2018', 'libai', '5200', '2018', '1061030417030401');
INSERT INTO `payfee_info` VALUES ('libai2019', 'libai', '5200', '2019', '1061030417030401');
INSERT INTO `payfee_info` VALUES ('liqiushui2017', 'liqiushui', '6200', '2017', '1061440617040601');
INSERT INTO `payfee_info` VALUES ('liqiushui2018', 'liqiushui', '6200', '2018', '1061440617040601');
INSERT INTO `payfee_info` VALUES ('liqiushui2019', 'liqiushui', '6200', '2019', '1061440617040601');
INSERT INTO `payfee_info` VALUES ('wangyuyan2017', 'zhongling', '6200', '2017', '1061440417040404');
INSERT INTO `payfee_info` VALUES ('wangyuyan2018', 'zhongling', '6200', '2018', '1061440417040404');
INSERT INTO `payfee_info` VALUES ('wangyuyan2019', 'zhongling', '6200', '2019', '1061440417040404');
INSERT INTO `payfee_info` VALUES ('yangyuhuan2017', 'yangyuhuan', '6200', '2017', '1061440417040403');
INSERT INTO `payfee_info` VALUES ('yangyuhuan2018', 'yangyuhuan', '6200', '2018', '1061440417040403');
INSERT INTO `payfee_info` VALUES ('yangyuhuan2019', 'yangyuhuan', '6200', '2019', '1061440417040403');
INSERT INTO `payfee_info` VALUES ('yunzhonghe2017', 'yunzhonghe', '6200', '2017', '1061030817030801');
INSERT INTO `payfee_info` VALUES ('yunzhonghe2018', 'yunzhonghe', '6200', '2018', '1061030817030801');
INSERT INTO `payfee_info` VALUES ('yunzhonghe2019', 'yunzhonghe', '6200', '2019', '1061030817030801');

-- ----------------------------
-- Table structure for school
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `school_class_id` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sql_id` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `school_id` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `school_name` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dep_id` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dep_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuition` float DEFAULT NULL,
  `accomodation` float DEFAULT NULL,
  PRIMARY KEY (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES ('5', '10610', '10610304', '四川大学', '304', '计算机学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610305', '四川大学', '305', '建筑与环境学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610306', '四川大学', '306', '水利水电工程学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610307', '四川大学', '307', '轻工与纺织工程学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610308', '四川大学', '308', '化学工程学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610309', '四川大学', '309', '轻工与纺织工程学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610310', '四川大学', '310', '软件学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610311', '四川大学', '311', '公共管理学院', '4000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610312', '四川大学', '312', '基础医学学院', '6000', '1200');
INSERT INTO `school` VALUES ('5', '10610', '10610313', '四川大学', '313', '临床医学院', '6000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614404', '电子科技大学', '404', '计算机学院', '4000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614405', '电子科技大学', '405', '建筑与环境学院', '4000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614406', '电子科技大学', '406', '水利水电工程学院', '4000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614407', '电子科技大学', '407', '轻工与纺织工程学院', '4000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614408', '电子科技大学', '408', '化学工程学院', '4000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614409', '电子科技大学', '409', '轻工与纺织工程学院', '4000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614410', '电子科技大学', '410', '软件学院', '4000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614411', '电子科技大学', '411', '公共管理学院', '3700', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614412', '电子科技大学', '412', '基础医学学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10614', '10614413', '电子科技大学', '413', '临床医学院', '5000', '1200');
INSERT INTO `school` VALUES ('5', '10615', '10615504', '西南石油大学', '504', '计算机学院', '4000', '1000');
INSERT INTO `school` VALUES ('5', '10615', '10615505', '西南石油大学', '505', '建筑与环境学院', '4000', '1000');
INSERT INTO `school` VALUES ('5', '10615', '10615506', '西南石油大学', '506', '水利水电工程学院', '4000', '1000');
INSERT INTO `school` VALUES ('5', '10615', '10615508', '西南石油大学', '508', '化学工程学院', '4000', '1000');
INSERT INTO `school` VALUES ('5', '10615', '10615509', '西南石油大学', '509', '轻工与纺织工程学院', '4000', '1000');
INSERT INTO `school` VALUES ('5', '10615', '10615510', '西南石油大学', '510', '软件学院', '4000', '1000');
INSERT INTO `school` VALUES ('5', '10615', '10615511', '西南石油大学', '511', '公共管理学院', '4000', '1000');
INSERT INTO `school` VALUES ('5', '10615', '10615607', '西南石油大学', '507', '轻工与纺织工程学院', '4000', '1000');
INSERT INTO `school` VALUES ('1', '20190101', '20190101', '大风车幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190102', '20190102', '达州市金兰幼稚园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190103', '20190103', '皇家幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190104', '20190104', '通顺幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190105', '20190105', '成都海蓓幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190106', '20190106', '第三幼儿园东升分园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190107', '20190107', '三电公司同济公司幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190108', '20190108', '四川音乐学院蜀都花园幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190109', '20190109', '四川音乐学院幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190110', '20190110', '内江市环城艺术学校', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190111', '20190111', '龙马潭区金龙乡中心幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('1', '20190112', '20190112', '龙马潭区石洞镇康乐幼儿园', null, '', '10000', null);
INSERT INTO `school` VALUES ('2', '20190201', '20190201', '四川音乐学院附属实验小学', null, '', '300', null);
INSERT INTO `school` VALUES ('2', '20190202', '20190202', '成都市磨子桥小学分校', null, '', '300', null);
INSERT INTO `school` VALUES ('2', '20190203', '20190203', '成都市太平寺西区小学', null, '', '300', null);
INSERT INTO `school` VALUES ('2', '20190204', '20190204', '成都市锦里小学', null, '', '300', null);
INSERT INTO `school` VALUES ('2', '20190205', '20190205', '成都市华兴小学', null, '', '300', null);
INSERT INTO `school` VALUES ('2', '20190206', '20190206', '成都市行知实验小学', null, '', '250', null);
INSERT INTO `school` VALUES ('2', '20190207', '20190207', '成都市盐道街小学', null, '', '250', null);
INSERT INTO `school` VALUES ('2', '20190208', '20190208', '成都市成师附小万科分校', null, '', '250', null);
INSERT INTO `school` VALUES ('2', '20190209', '20190209', '成都市聚星小学', null, '', '250', null);
INSERT INTO `school` VALUES ('2', '20190210', '20190210', '成都市琉璃地区中心校', null, '', '200', null);
INSERT INTO `school` VALUES ('2', '20190211', '20190211', '成师附小华润分校', null, '', '200', null);
INSERT INTO `school` VALUES ('2', '20190212', '20190212', '成都市大观小学', null, '', '200', null);
INSERT INTO `school` VALUES ('2', '20190213', '20190213', '成都成华实验小学', null, '', '200', null);
INSERT INTO `school` VALUES ('3', '20190301', '20190301', '咸丰县第一中学', null, '', '300', null);
INSERT INTO `school` VALUES ('3', '20190302', '20190302', '咸丰县第二中学', null, '', '300', null);
INSERT INTO `school` VALUES ('3', '20190303', '20190303', '咸丰县第三中学', null, '', '300', null);
INSERT INTO `school` VALUES ('3', '20190304', '20190304', '咸丰县第四中学', null, '', '300', null);
INSERT INTO `school` VALUES ('3', '20190305', '20190305', '成都市金牛实验中学', null, '', '250', null);
INSERT INTO `school` VALUES ('3', '20190306', '20190306', '成都市锦城学校', null, '', '250', null);
INSERT INTO `school` VALUES ('3', '20190307', '20190307', '树德协进中学', null, '', '250', null);
INSERT INTO `school` VALUES ('3', '20190308', '20190308', '都江堰市光亚学校', null, '', '250', null);
INSERT INTO `school` VALUES ('3', '20190309', '20190309', '棠湖中学外国语实验学校', null, '', '250', null);
INSERT INTO `school` VALUES ('3', '20190310', '20190310', '洪河中学', null, '', '200', null);
INSERT INTO `school` VALUES ('3', '20190311', '20190311', '成都市第八中学', null, '', '200', null);
INSERT INTO `school` VALUES ('3', '20190312', '20190312', '成都市第二十八中学', null, '', '200', null);
INSERT INTO `school` VALUES ('3', '20190313', '20190313', '成都市第二十九中学', null, '', '200', null);
INSERT INTO `school` VALUES ('3', '20190314', '20190314', '成都市第三十中学', null, '', '200', null);
INSERT INTO `school` VALUES ('3', '20190315', '20190315', '成都市第三十一中学', null, '', '200', null);
INSERT INTO `school` VALUES ('4', '20190401', '20190401', '四川省双流中学', null, '', '800', null);
INSERT INTO `school` VALUES ('4', '20190402', '20190402', '成都市龙泉外国语实验学校', null, '', '800', null);
INSERT INTO `school` VALUES ('4', '20190403', '20190403', '棕北中学西区实验学校', null, '', '800', null);
INSERT INTO `school` VALUES ('4', '20190404', '20190404', '成都市第十二中学', null, '', '800', null);
INSERT INTO `school` VALUES ('4', '20190405', '20190405', '成都石室双楠实验学校', null, '', '800', null);
INSERT INTO `school` VALUES ('4', '20190406', '20190406', '成都机投实验学校', null, '', '700', null);
INSERT INTO `school` VALUES ('4', '20190407', '20190407', '成市石室联合中学', null, '', '700', null);
INSERT INTO `school` VALUES ('4', '20190408', '20190408', '成都市树德实验中学（西区）', null, '', '700', null);
INSERT INTO `school` VALUES ('4', '20190409', '20190409', '成都市中和中学', null, '', '600', null);
INSERT INTO `school` VALUES ('4', '20190410', '20190410', '成都七中嘉祥外国语学校', null, '', '600', null);
INSERT INTO `school` VALUES ('4', '20190411', '20190411', '北京师范大学成都实验中学', null, '', '600', null);
INSERT INTO `school` VALUES ('4', '20190412', '20190412', '绵阳二中', null, '', '600', null);
INSERT INTO `school` VALUES ('4', '20190413', '20190413', '绵阳三中', null, '', '600', null);
INSERT INTO `school` VALUES ('4', '20190414', '20190414', '绵阳四中', null, '', '600', null);
INSERT INTO `school` VALUES ('4', '20190415', '20190415', '绵阳五中', null, '', '600', null);

-- ----------------------------
-- Table structure for school_class
-- ----------------------------
DROP TABLE IF EXISTS `school_class`;
CREATE TABLE `school_class` (
  `school_class_id` varchar(3) COLLATE utf8_unicode_ci NOT NULL,
  `school_class` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`school_class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of school_class
-- ----------------------------
INSERT INTO `school_class` VALUES ('1', '幼儿园');
INSERT INTO `school_class` VALUES ('2', '小学');
INSERT INTO `school_class` VALUES ('3', '初中');
INSERT INTO `school_class` VALUES ('4', '高中');
INSERT INTO `school_class` VALUES ('5', '大学');

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `school_id` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `dep_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_sno` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_name` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_sex` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_paw` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `time_adm` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_tel` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `identity` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `user_id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `educational_system` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `school_id` (`school_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `students_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`),
  CONSTRAINT `students_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES ('10610304', '四川大学', '2017030401', '李白', '男', '123456', '2017', '15188888888', '528320199901016712', '1061030417030401', 'libai', '3');
INSERT INTO `students` VALUES ('10610304', '四川大学', '2017030402', '杜甫', '男', '123456', '2017', '15188882345', '528320199901073418', '1061030417030402', 'dufu', '3');
INSERT INTO `students` VALUES ('10610305', '四川大学', '2017030501', '万庆澜', '男', '123456', '2017', '15188812345', '528320199901012345', '1061030517030501', 'wanqinglan', '3');
INSERT INTO `students` VALUES ('10610306', '四川大学', '2017030601', '刀白凤', '女', '123456', '2017', '15188812354', '528320199901012354', '1061030617030601', 'daobaifeng', '3');
INSERT INTO `students` VALUES ('10610307', '四川大学', '2017030701', '丁春秋', '男', '123456', '2017', '15188812435', '528320199901012435', '1061030717030701', 'dingchunqiu', '3');
INSERT INTO `students` VALUES ('10610308', '四川大学', '2017030801', '云中鹤', '男', '123456', '2017', '15188812453', '528320199901012453', '1061030817030801', 'yunzhonghe', '3');
INSERT INTO `students` VALUES ('10614404', '电子科技大学', '2017040401', '白居易', '男', '123456', '2017', '15188823455', '528320199901033415', '1061440417040401', 'baijuyi', '3');
INSERT INTO `students` VALUES ('10614404', '电子科技大学', '2017040402', '高力士', '男', '123456', '2017', '15188884568', '528320199901047616', '1061440417040402', 'gaolishi', '3');
INSERT INTO `students` VALUES ('10614404', '电子科技大学', '2017040403', '杨玉环', '女', '123456', '2017', '15188883245', '528320199901056722', '1061440417040403', 'yangyuhuan', '3');
INSERT INTO `students` VALUES ('10614404', '电子科技大学', '2017040404', '王语嫣', '女', '123456', '2017', '15188812543', '528320199901012543', '1061440417040404', 'wangyuyan', '3');
INSERT INTO `students` VALUES ('10614405', '电子科技大学', '2017040501', '阮星竹', '女', '123456', '2017', '15188813245', '528320199901013245', '1061440517040501', 'ruanxingzhu', '3');
INSERT INTO `students` VALUES ('10614406', '电子科技大学', '2017040601', '李秋水', '女', '123456', '2017', '15188813254', '528320199901013254', '1061440617040601', 'liqiushui', '3');
INSERT INTO `students` VALUES ('10614408', '电子科技大学', '2017040801', '段正淳', '男', '123456', '2017', '15188813452', '528320199901013452', '106144082017040801', 'duanzhengchun', '3');
INSERT INTO `students` VALUES ('10615504', '西南石油大学', '2017050401', '段誉', '男', '123456', '2017', '15188813524', '528320199901013524', '1061550417050401', 'duanyu', '3');
INSERT INTO `students` VALUES ('10615505', '西南石油大学', '2017050501', '苏星河', '男', '123456', '2017', '15188813542', '528320199901013542', '10615505170505012', 'suxinghe', '3');
INSERT INTO `students` VALUES ('10615506', '西南石油大学', '2017050601', '虚竹', '男', '123456', '2017', '15188814235', '528320199901014235', '1061550617050601', 'xuzhu', '3');
INSERT INTO `students` VALUES ('10615508', '西南石油大学', '2017050801', '无崖子', '男', '123456', '2017', '15188814325', '528320199901014325', '1061550817050801', 'wuyazi', '3');
INSERT INTO `students` VALUES ('10610309', '四川大学', '2017030901', '邓百川', '男', '123456', '2017', '15188812534', '528320199901012534', '11061030917030901', 'dengbaichuan', '3');
INSERT INTO `students` VALUES ('10614407', '电子科技大学', '2017040701', '吴长风', '男', '123456', '2017', '15188813425', '528320199901013425', '11061440717040701', 'wuchangfeng', '3');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(18) COLLATE utf8_unicode_ci NOT NULL,
  `user_tel` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_name` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `identity` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_paw` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('20191211234806720', '1124213', '代利文', '1231243', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('baijuyi', '15188823455', '白居易', '528320199901033415', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('daobaifeng', '15188812354', '刀白凤', '528320199901012354', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('dengbaichuan', '15188812534', '邓百川', '528320199901012534', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('dingchunqiu', '15188812435', '丁春秋', '528320199901012435', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('duanyu', '15188813524', '段誉', '528320199901013524', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('duanzhengchun', '15188813452', '段正淳', '528320199901013452', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('dufu', '15188882345', '杜甫', '528320199901073418', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('gaolishi', '15188884568', '高力士', '528320199901047616', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('libai', '15188888888', '李白', '528320199901016712', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('liqiushui', '15188813254', '李秋水', '528320199901013254', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('ruanxingzhu', '15188813245', '阮星竹', '528320199901013245', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('suxinghe', '15188813542', '苏星河', '528320199901013542', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('wangyuyan', '15188812543', '王语嫣', '528320199901012543', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('wanqinglan', '15188812345', '万庆澜', '528320199901012345', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('wuchangfeng', '15188813425', '吴长风', '528320199901013425', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('wuyazi', '15188814325', '无崖子', '528320199901014325', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('xuzhu', '15188814235', '虚竹', '528320199901014235', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('yangyuhuan', '15188883245', '杨玉环', '528320199901056722', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('yunzhonghe', '15188812453', '云中鹤', '528320199901012453', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `user` VALUES ('zhongling', '15188814253', '钟灵', '528320199901014253', 'e10adc3949ba59abbe56e057f20f883e');
