package uk.me.lwood.sigtran.tcap.dialogue;

import uk.me.lwood.asn1.Choice;

/**
 * 
 * @author lukew
 */
public class DialoguePdu implements Choice {
    private final AarqApdu dialogueRequest;
    private final AareApdu dialogueResponse;
    private final AbrtApdu dialogueAbort;
    
    public DialoguePdu(AarqApdu dialogueRequest) {
        this(dialogueRequest, null, null);
    }
    
    public DialoguePdu(AareApdu dialogueResponse) {
        this(null, dialogueResponse, null);
    }
    
    public DialoguePdu(AbrtApdu dialogueAbort) {
        this(null, null, dialogueAbort);
    }
    
    private DialoguePdu(AarqApdu dialogueRequest, AareApdu dialogueResponse, AbrtApdu dialogueAbort) {
        this.dialogueRequest = dialogueRequest;
        this.dialogueResponse = dialogueResponse;
        this.dialogueAbort = dialogueAbort;
    }
    
    @Override
    public Object getChoice() {
        if (dialogueRequest != null)
            return dialogueRequest;
        
        if (dialogueResponse != null)
            return dialogueResponse;
        
        return dialogueAbort;
    }
    
}
