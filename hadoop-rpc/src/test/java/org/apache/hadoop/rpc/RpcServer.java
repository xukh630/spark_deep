/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;


public class RpcServer {

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		RPC.Server server = RPC.getServer(new DemoServiceImpl(),
				conf.get("server.ip.name"),
				conf.getInt("name:port", 8888),
				3,
				true,
				conf);
		server.start();
		// server.stop();
	}
}
