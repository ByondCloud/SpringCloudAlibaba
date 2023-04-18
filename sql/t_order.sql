/*
 Navicat MySQL Data Transfer

 Source Server         : example
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : seata_order

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 16/04/2023 20:17:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` bigint(0) NOT NULL COMMENT '主键',
  `user_id` bigint(0) NULL DEFAULT NULL COMMENT '用户id',
  `product_id` bigint(0) NULL DEFAULT NULL COMMENT '产品id',
  `count` int(0) NULL DEFAULT NULL COMMENT '数量',
  `money` decimal(11, 0) NULL DEFAULT NULL COMMENT '金额',
  `status` int(0) NULL DEFAULT NULL COMMENT '订单状态 0创建中 1已完结',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
