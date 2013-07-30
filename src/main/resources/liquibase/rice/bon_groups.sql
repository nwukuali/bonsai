-- 
--  CREATE BSS Groups
-- 
--  CREATE "ITC BSS Internal Development Group" GROUP
DELETE FROM bonsai.KRIM_GRP_T WHERE GRP_NM = 'ITC BSS Internal Development Group' AND NMSPC_CD = 'KUALI'
;
INSERT INTO bonsai.KRIM_GRP_ID_S VALUES (NULL)
;
INSERT INTO bonsai.KRIM_GRP_T (GRP_ID, OBJ_ID, VER_NBR, GRP_NM, NMSPC_CD, GRP_DESC, KIM_TYP_ID, ACTV_IND, LAST_UPDT_DT )
VALUES  ((Select max(id) from bonsai.KRIM_GRP_ID_S), uuid(), '1', 'ITC BSS Internal Development Group', 'KUALI', 'ITC BSS Internal Development Group', '1', 'Y', NOW())
;
-- CREATE "ITC BSS Support Group" GROUP
DELETE FROM bonsai.KRIM_GRP_T WHERE GRP_NM = 'ITC BSS Support Group' AND NMSPC_CD = 'KUALI'
;
INSERT INTO bonsai.KRIM_GRP_ID_S VALUES (NULL)
;
INSERT INTO bonsai.KRIM_GRP_T (GRP_ID, OBJ_ID, VER_NBR, GRP_NM, NMSPC_CD, GRP_DESC, KIM_TYP_ID, ACTV_IND, LAST_UPDT_DT )
VALUES  ((Select max(id) from bonsai.KRIM_GRP_ID_S), uuid(), '1', 'ITC BSS Support Group', 'KUALI', 'ITC BSS Support Group', '1', 'Y', NOW())
;
-- CREATE "ITC BSS Kuali Development Group" GROUP
DELETE FROM bonsai.KRIM_GRP_T WHERE GRP_NM = 'ITC BSS Kuali Development Group' AND NMSPC_CD = 'KUALI'
;
INSERT INTO bonsai.KRIM_GRP_ID_S VALUES (NULL)
;
INSERT INTO bonsai.KRIM_GRP_T (GRP_ID, OBJ_ID, VER_NBR, GRP_NM, NMSPC_CD, GRP_DESC, KIM_TYP_ID, ACTV_IND, LAST_UPDT_DT )
VALUES  ((Select max(id) from bonsai.KRIM_GRP_ID_S), uuid(), '1', 'ITC BSS Kuali Development Group', 'KUALI', 'ITC BSS Kuali Development Group', '1', 'Y', NOW())
;
-- CREATE "ITC BSS Internal Development Manager Group" GROUP
DELETE FROM bonsai.KRIM_GRP_T WHERE GRP_NM = 'ITC BSS Internal Development Manager Group' AND NMSPC_CD = 'KUALI'
;
INSERT INTO bonsai.KRIM_GRP_ID_S VALUES (NULL)
;
INSERT INTO bonsai.KRIM_GRP_T (GRP_ID, OBJ_ID, VER_NBR, GRP_NM, NMSPC_CD, GRP_DESC, KIM_TYP_ID, ACTV_IND, LAST_UPDT_DT )
VALUES  ((Select max(id) from bonsai.KRIM_GRP_ID_S), uuid(), '1', 'ITC BSS Internal Development Manager Group', 'KUALI', 'ITC BSS Internal Development Manager Group', '1', 'Y', NOW())
;
-- CREATE "ITC BSS Support Manager Group" GROUP
DELETE FROM bonsai.KRIM_GRP_T WHERE GRP_NM = 'ITC BSS Support Manager Group' AND NMSPC_CD = 'KUALI'
;
INSERT INTO bonsai.KRIM_GRP_ID_S VALUES (NULL)
;
INSERT INTO bonsai.KRIM_GRP_T (GRP_ID, OBJ_ID, VER_NBR, GRP_NM, NMSPC_CD, GRP_DESC, KIM_TYP_ID, ACTV_IND, LAST_UPDT_DT )
VALUES  ((Select max(id) from bonsai.KRIM_GRP_ID_S), uuid(), '1', 'ITC BSS Support Manager Group', 'KUALI', 'ITC BSS Support Manager Group', '1', 'Y', NOW())
;
-- CREATE "ITC BSS Kuali Development Manager Group" GROUP
DELETE FROM bonsai.KRIM_GRP_T WHERE GRP_NM = 'ITC BSS Kuali Development Manager Group' AND NMSPC_CD = 'KUALI'
;
INSERT INTO bonsai.KRIM_GRP_ID_S VALUES (NULL)
;
INSERT INTO bonsai.KRIM_GRP_T (GRP_ID, OBJ_ID, VER_NBR, GRP_NM, NMSPC_CD, GRP_DESC, KIM_TYP_ID, ACTV_IND, LAST_UPDT_DT )
VALUES  ((Select max(id) from bonsai.KRIM_GRP_ID_S), uuid(), '1', 'ITC BSS Kuali Development Manager Group', 'KUALI', 'ITC BSS Kuali Development Manager Group', '1', 'Y', NOW())
;
-- CREATE "ITC BSS Manager Group" GROUP
DELETE FROM bonsai.KRIM_GRP_T WHERE GRP_NM = 'ITC BSS Manager Group' AND NMSPC_CD = 'KUALI'
;
INSERT INTO bonsai.KRIM_GRP_ID_S VALUES (NULL)
;
INSERT INTO bonsai.KRIM_GRP_T (GRP_ID, OBJ_ID, VER_NBR, GRP_NM, NMSPC_CD, GRP_DESC, KIM_TYP_ID, ACTV_IND, LAST_UPDT_DT )
VALUES  ((Select max(id) from bonsai.KRIM_GRP_ID_S), uuid(), '1', 'ITC BSS Manager Group', 'KUALI', 'ITC BSS Manager Group', '1', 'Y', NOW())
;
-- CREATE "ITC BSS Admin Group" GROUP
DELETE FROM bonsai.KRIM_GRP_T WHERE GRP_NM = 'ITC BSS Admin Group' AND NMSPC_CD = 'KUALI'
;
INSERT INTO bonsai.KRIM_GRP_ID_S VALUES (NULL)
;
INSERT INTO bonsai.KRIM_GRP_T (GRP_ID, OBJ_ID, VER_NBR, GRP_NM, NMSPC_CD, GRP_DESC, KIM_TYP_ID, ACTV_IND, LAST_UPDT_DT )
VALUES  ((Select max(id) from bonsai.KRIM_GRP_ID_S), uuid(), '1', 'ITC BSS Admin Group', 'KUALI', 'ITC BSS Admin Group', '1', 'Y', NOW())
;