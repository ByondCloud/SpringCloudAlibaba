/*
 Navicat MySQL Data Transfer

 Source Server         : example
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : seata_storage

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 16/04/2023 20:21:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_storage
-- ----------------------------
DROP TABLE IF EXISTS `t_storage`;
CREATE TABLE `t_storage`  (
  `id` bigint(0) NOT NULL COMMENT '主键',
  `product_id` bigint(0) NULL DEFAULT NULL COMMENT '产品id',
  `total` int(0) NULL DEFAULT NULL COMMENT '总库存',
  `used` int(0) NULL DEFAULT NULL COMMENT '已用库存',
  `residue` int(0) NULL DEFAULT NULL COMMENT '剩余库存',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
