/*
 *  Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.alibaba.fescar.core.model;

public enum BranchType {

    // AT Branch 自动
    AT,

    // MT Branch 手动
    MT;

    public static BranchType get(byte ordinal) {
        return get((int) ordinal);
    }
    public static BranchType get(int ordinal) {
        for (BranchType branchType : BranchType.values()) {
            if (branchType.ordinal() == ordinal) {
                return branchType;
            }
        }
        throw new IllegalArgumentException("Unknown BranchType[" + ordinal + "]");
    }
}
