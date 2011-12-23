#import "TiProxy.h"
#import "NoteStore.h"

@interface JpMasuidriveTiEvernoteapiSyncChunkFilterProxy : TiProxy {
@private
    EDAMSyncChunkFilter* object;
}
@property (nonatomic, retain) EDAMSyncChunkFilter* object;

- (id)initWithObject:(EDAMSyncChunkFilter*)object_;
@end