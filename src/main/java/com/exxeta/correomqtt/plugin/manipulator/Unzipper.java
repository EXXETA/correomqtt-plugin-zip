package com.exxeta.correomqtt.plugin.manipulator;

import com.exxeta.correomqtt.plugin.spi.DetailViewManipulatorHook;
import com.exxeta.correomqtt.plugin.spi.ExtensionId;
import org.pf4j.Extension;

@Extension
@ExtensionId("unzip")
public class Unzipper implements DetailViewManipulatorHook {

    @Override
    public byte[] manipulate(byte[] bytes) {
        return ZipUtils.unzip(bytes);
    }
}
