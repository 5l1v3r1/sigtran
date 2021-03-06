package uk.me.lwood.sigtran.map.sms;

import uk.me.lwood.asn1.UniversalType;
import uk.me.lwood.asn1.annotations.Asn1Type;
import uk.me.lwood.asn1.annotations.Optional;
import uk.me.lwood.sigtran.map.common.SignalInfo;
import uk.me.lwood.sigtran.tcap.TcapArgument;

/**
 * 
 * @author lukew
 */
public class MTForwardSMArg implements TcapArgument {
    private final SmRpDa smRpDa;
    private final SmRpOa smRpOa;
    private final SignalInfo smRpUi;
    @Optional
    @Asn1Type(UniversalType.NULL)
    private final boolean moreMessagesToSend;
    
    public MTForwardSMArg(SmRpDa smRpDa, SmRpOa smRpOa, SignalInfo smRpUi, boolean moreMessagesToSend) {
        this.smRpDa = smRpDa;
        this.smRpOa = smRpOa;
        this.smRpUi = smRpUi;
        this.moreMessagesToSend = moreMessagesToSend;
    }

    public final SmRpDa getSmRpDa() {
        return smRpDa;
    }

    public final SmRpOa getSmRpOa() {
        return smRpOa;
    }

    public final SignalInfo getSmRpUi() {
        return smRpUi;
    }

    public final boolean isMoreMessagesToSend() {
        return moreMessagesToSend;
    }
}
