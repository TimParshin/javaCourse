package pro.it.sis.javacourse;

import lombok.Builder;

public class Proofness {

    @Builder
    public Proofness(boolean isIceProof, boolean isFireProof) {
        this.isIceProof = isIceProof;
        this.isFireProof = isFireProof;
    }

    private boolean isIceProof;
    private boolean isFireProof;

    public Proofness() {}
}
