-- 
-- Add Members to ITC BSS Groups
-- 
-- 
-- Add Members "ITC BSS Internal Development Group" GROUP
-- 
DELETE FROM bonsai.KRIM_GRP_MBR_T WHERE GRP_ID = (Select grp_id from bonsai.krim_grp_t where grp_nm = 'ITC BSS Internal Development Group')
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Gert
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'13073656', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Roald
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'12795631', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Johann
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'12927252', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Adriaan
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'13098241', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Johan
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'10952918', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Dylan
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'24296546', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Armando
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'21717125', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Bertie
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'20545770', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Karl
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'21204748', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Jean
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Group'),'12975672', 'P', NULL, NULL, NOW())
;
-- 
-- Add Members "ITC BSS Support Group" GROUP
-- 
DELETE FROM bonsai.KRIM_GRP_MBR_T WHERE GRP_ID = (Select grp_id from bonsai.krim_grp_t where grp_nm = 'ITC BSS Support Group')
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Ahmed
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Support Group'),'22282785', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Karien
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Support Group'),'10515623', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Roald
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Support Group'),'12795631', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Johann
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Support Group'),'12927252', 'P', NULL, NULL, NOW())
;
-- 
-- Add Members "ITC BSS Kuali Development Group" GROUP
-- 
DELETE FROM bonsai.KRIM_GRP_MBR_T WHERE GRP_ID = (Select grp_id from bonsai.krim_grp_t where grp_nm = 'ITC BSS Kuali Development Group')
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Alta
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Kuali Development Group'),'12209139', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Danie
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Kuali Development Group'),'21310823', 'P', NULL, NULL, NOW())
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Liaan
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Kuali Development Group'),'20670494', 'P', NULL, NULL, NOW())
;
-- 
-- Add Members "ITC BSS Internal Development Manager Group" GROUP
-- 
DELETE FROM bonsai.KRIM_GRP_MBR_T WHERE GRP_ID = (Select grp_id from bonsai.krim_grp_t where grp_nm = 'ITC BSS Internal Development Manager Group')
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Anna-Marie
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Internal Development Manager Group'),'10000372', 'P', NULL, NULL, NOW())
;
-- 
-- Add Members "ITC BSS Support Manager Group" GROUP
-- 
DELETE FROM bonsai.KRIM_GRP_MBR_T WHERE GRP_ID = (Select grp_id from bonsai.krim_grp_t where grp_nm = 'ITC BSS Support Manager Group')
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Dassie
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Support Manager Group'),'13293486', 'P', NULL, NULL, NOW())
;
-- 
-- Add Members "ITC BSS Kuali Development Manager Group" GROUP
--  
DELETE FROM bonsai.KRIM_GRP_MBR_T WHERE GRP_ID = (Select grp_id from bonsai.krim_grp_t where grp_nm = 'ITC BSS Kuali Development Manager Group')
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Nina
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Kuali Development Manager Group'),'22931902', 'P', NULL, NULL, NOW())
;
-- 
-- Add Members "ITC BSS Manager Group" GROUP
-- 
DELETE FROM bonsai.KRIM_GRP_MBR_T WHERE GRP_ID = (Select grp_id from bonsai.krim_grp_t where grp_nm = 'ITC BSS Manager Group')
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Mari
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Manager Group'),'10000445', 'P', NULL, NULL, NOW())
;
-- 
-- Add Members "ITC BSS Admin Group" GROUP
--  
DELETE FROM bonsai.KRIM_GRP_MBR_T WHERE GRP_ID = (Select grp_id from bonsai.krim_grp_t where grp_nm = 'ITC BSS Admin Group')
;
INSERT INTO bonsai.KRIM_GRP_MBR_ID_S VALUES (NULL)
;
-- Jenny
INSERT INTO bonsai.KRIM_GRP_MBR_T (GRP_MBR_ID, VER_NBR, OBJ_ID, GRP_ID, MBR_ID, MBR_TYP_CD, ACTV_FRM_DT, ACTV_TO_DT, LAST_UPDT_DT)
VALUES  ((Select max(id) from bonsai.krim_grp_mbr_id_s), 1, uuid(), (Select grp_id from bonsai.KRIM_GRP_T  where grp_nm = 'ITC BSS Admin Group'),'12324256', 'P', NULL, NULL, NOW())
;