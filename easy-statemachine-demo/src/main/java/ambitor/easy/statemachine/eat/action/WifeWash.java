package ambitor.easy.statemachine.eat.action;


import ambitor.easy.statemachine.core.context.StateContext;
import ambitor.easy.statemachine.workflow.action.WorkFlowAction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WifeWash implements WorkFlowAction<String, String> {

    @Override
    public void execute(StateContext<String, String> context) {
        log.info("老婆洗碗，洗的很仔细");
    }
}