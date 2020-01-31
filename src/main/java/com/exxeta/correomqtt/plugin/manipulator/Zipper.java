package com.exxeta.correomqtt.plugin.manipulator;

import com.exxeta.correomqtt.plugin.spi.DetailViewManipulatorHook;
import com.exxeta.correomqtt.plugin.spi.ExtensionId;
import org.pf4j.Extension;

@Extension
@ExtensionId("zip")
public class Zipper implements DetailViewManipulatorHook {

    @Override
    public byte[] manipulate(byte[] bytes) {
        return ZipUtils.zip(bytes);
    }
}
