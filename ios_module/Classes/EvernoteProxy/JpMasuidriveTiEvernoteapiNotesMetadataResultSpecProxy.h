#import "TiProxy.h"
#import "NoteStore.h"

@interface JpMasuidriveTiEvernoteapiNotesMetadataResultSpecProxy : TiProxy {
@private
    EDAMNotesMetadataResultSpec* object;
}
@property (nonatomic, retain) EDAMNotesMetadataResultSpec* object;

- (id)initWithObject:(EDAMNotesMetadataResultSpec*)object_;
@end