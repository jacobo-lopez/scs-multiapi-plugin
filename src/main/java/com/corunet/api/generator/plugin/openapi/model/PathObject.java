/*
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.corunet.api.generator.plugin.openapi.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PathObject {

  private String pathName;
  private GlobalObject globalObjects;
  private List<OperationObject> operationObject;
}