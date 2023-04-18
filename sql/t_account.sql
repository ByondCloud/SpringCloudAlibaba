/*
 Navicat MySQL Data Transfer

 Source Server         : example
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : seata_account

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 16/04/2023 20:24:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account`  (
  `id` bigint(0) NOT NULL COMMENT '主键',
  `user_id` bigint(0) NULL DEFAULT NULL COMMENT '用户id',
  `total` decimal(10, 0) NULL DEFAULT NULL COMMENT '总额度',
  `used` decimal(10, 0) NULL DEFAULT NULL COMMENT '已用额度',
  `residue` decimal(10, 0) NULL DEFAULT NULL COMMENT '剩余可用额度',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_account
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
